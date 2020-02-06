import {
	IGenerator,
	IGeneratorResult,
	TGeneratorResult,
} from 'jsoncodegen-types-for-generator'
import { generateInterface } from './fun/generateInterface'
import { generateNumberEnum } from './fun/generateNumberEnum'
import { generateStringEnum } from './fun/generateStringEnum'

export interface IConfig {
	package?: string
}

const generator: IGenerator = {
	async generate(config: IConfig, namedTypesById): Promise<TGeneratorResult> {
		const rootPackageName =
			config.package != null ? config.package.split('.') : []

		let result: IGeneratorResult[] = []
		for (const namedType of namedTypesById.values()) {
			switch (namedType.kind) {
				case 'Interface':
					result = [
						...result,
						...(await generateInterface({
							rootPackageName,
							info: namedType,
						})),
					]
					break
				case 'NumberEnum':
					result = [
						...result,
						...(await generateNumberEnum({
							rootPackageName,
							info: namedType,
						})),
					]
					break
				case 'StringEnum':
					result = [
						...result,
						...(await generateStringEnum({
							rootPackageName,
							info: namedType,
						})),
					]
					break
			}
		}
		return result
	},
}

module.exports = generator
