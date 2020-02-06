import { IGeneratorResult, INumberEnum } from 'jsoncodegen-types-for-generator'
import { templateOfNumberEnumCompanionObject } from '../template/templateOfNumberEnumCompanionObject'
import { indent } from './indent'
import { joinWith } from './joinWith'
import { makeComment } from './makeComment'
import { makeEnumValues } from './makeEnumValues'
import { makePackageName } from './makePackageName'

export async function generateNumberEnum({
	rootPackageName,
	info,
}: {
	rootPackageName: string[]
	info: INumberEnum
}): Promise<IGeneratorResult[]> {
	const { directoryPath, name, values, description } = info
	return [
		{
			filePath: [...directoryPath, name + '.kt'],
			content: joinWith('\n')(
				`package ${makePackageName(rootPackageName, directoryPath)}\n`,
				`import com.fasterxml.jackson.annotation.JsonCreator`,
				`import com.fasterxml.jackson.annotation.JsonValue\n`,
				makeComment(description),
				`enum class ${name}(@get:JsonValue val value: Double) {`,
				indent(makeEnumValues({ enumValues: values })),
				indent(`;\n`),
				indent(templateOfNumberEnumCompanionObject({ name })),
				`}\n`,
			),
		},
	]
}
