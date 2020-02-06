import {
	IGeneratorResult,
	IInterface,
	INumberEnumValueReference,
	IStringEnumValueReference,
} from 'jsoncodegen-types-for-generator'
import { getType } from './getType'
import { indent } from './indent'
import { joinWith } from './joinWith'
import { makeComment } from './makeComment'
import { makePackageName } from './makePackageName'

export async function generateInterface({
	rootPackageName,
	info,
}: {
	rootPackageName: string[]
	info: IInterface
}): Promise<IGeneratorResult[]> {
	const result: IGeneratorResult[] = []
	const { directoryPath, name, fields, description } = info
	const declarations = fields
		.filter(
			field =>
				!(
					field.fieldType.kind === 'NumberEnumValueReference' ||
					field.fieldType.kind === 'StringEnumValueReference'
				),
		)
		.map(field => {
			const comment = makeComment(field.description)
			const declaration = `val ${field.name}: ${getType(
				rootPackageName,
				field.fieldType,
			)}${field.fieldType.isNullable ? ' = null' : ''}`
			return joinWith('\n')(comment, declaration)
		})
		.join(`,\n`)
	const finalDeclarations = fields
		.filter(
			field =>
				field.fieldType.kind === 'NumberEnumValueReference' ||
				field.fieldType.kind === 'StringEnumValueReference',
		)
		.map(field => {
			const comment = makeComment(field.description)
			const t = field.fieldType as
				| INumberEnumValueReference
				| IStringEnumValueReference
			const declaration = `val ${
				field.name
			} = ${makePackageName(rootPackageName, [
				...t.absoluteDirectoryPath,
				t.name,
			])}.${t.valueName}`
			return joinWith('\n')(comment, declaration)
		})
		.join(`\n`)
	const content = joinWith('\n')(
		`package ${makePackageName(rootPackageName, directoryPath)}\n`,
		!declarations && `import com.fasterxml.jackson.annotation.JsonIgnore\n`,
		makeComment(description),
		`data class ${name}(`,
		indent(
			declarations ||
				`@JsonIgnore val __dummyParameterPleaseIgnore__: __Dummy__ = __Dummy__.Param`,
		),
		`) {`,
		!declarations && indent(`enum class __Dummy__ { Param }`),
		indent(finalDeclarations),
		`}\n`,
	)
	result.push({
		filePath: [...directoryPath, name + '.kt'],
		content: content,
	})
	return result
}
