import {
	INumberEnumValue,
	IStringEnumValue,
} from 'jsoncodegen-types-for-generator'
import { format } from './format'
import { joinWith } from './joinWith'
import { makeComment } from './makeComment'

export function makeEnumValues({
	enumValues,
}: {
	enumValues: (IStringEnumValue | INumberEnumValue)[]
}) {
	return enumValues
		.map(value => {
			const comment = makeComment(value.description)
			const declaration = `${value.name}(${format(value.value)}),`
			return joinWith('\n')(comment, declaration)
		})
		.join(`\n`)
}
