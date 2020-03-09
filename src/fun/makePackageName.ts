import { reservedPackageNameKeywords } from '../reservedPackageNameKeywords'

export function makePackageName(pkg: string[], dir: string[]) {
	const result = [...pkg, ...dir]
	for (const item of result) {
		if (reservedPackageNameKeywords.has(item)) {
			throw new Error(
				`[q1c0ei] Reserved keyword cannot be used as identifier in Kotlin: ${item} (in package name ${result.join(
					'.',
				)}`,
			)
		}
	}
	return result.join('.')
}
