import { TFieldType } from 'jsoncodegen-types-for-generator'
import { makePackageName } from './makePackageName'

export function getType(
	rootPackageName: string[],
	fieldType: TFieldType,
): string {
	const nullableSuffix = fieldType.isNullable ? '?' : ''
	switch (fieldType.kind) {
		case 'PrimitiveValue':
			switch (fieldType.name) {
				case 'boolean':
					return 'Boolean' + nullableSuffix
				case 'number':
					return 'Double' + nullableSuffix
				case 'string':
					return 'String' + nullableSuffix
				default:
					throw new Error(
						`[q56oz3] Unknown primitive value: ${fieldType.name}`,
					)
			}
		case 'InterfaceReference':
		case 'NumberEnumReference':
		case 'StringEnumReference':
		case 'NumberEnumValueReference':
		case 'StringEnumValueReference':
			return (
				makePackageName(
					rootPackageName,
					fieldType.absoluteDirectoryPath,
				) +
				'.' +
				fieldType.name +
				nullableSuffix
			)
		case 'Array':
			return (
				`List<${getType(rootPackageName, fieldType.fieldType)}>` +
				nullableSuffix
			)
		case 'Map':
			return (
				`Map<String, ${getType(
					rootPackageName,
					fieldType.fieldType,
				)}>` + nullableSuffix
			)
		default:
			throw new Error(
				`[q56oyz] Unknown type: ${(fieldType as TFieldType).kind}`,
			)
	}
}
