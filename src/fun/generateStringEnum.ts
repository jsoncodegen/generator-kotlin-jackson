import { IGeneratorResult, IStringEnum } from 'jsoncodegen-types-for-generator'
import { indent } from './indent'
import { joinWith } from './joinWith'
import { makeComment } from './makeComment'
import { makeEnumValues } from './makeEnumValues'
import { makePackageName } from './makePackageName'

export async function generateStringEnum({
	rootPackageName,
	info,
}: {
	rootPackageName: string[]
	info: IStringEnum
}): Promise<IGeneratorResult[]> {
	const { directoryPath, name, values, description } = info
	return [
		{
			filePath: [...directoryPath, name + '.kt'],
			content: joinWith(`\n`)(
				`package ${makePackageName(rootPackageName, directoryPath)}\n`,
				`import com.fasterxml.jackson.annotation.JsonValue\n`,
				makeComment(description),
				`enum class ${name}(@get:JsonValue val value: String) {`,
				indent(makeEnumValues({ enumValues: values })),
				`}\n`,
			),
		},
	]
}
