export function format(value: string | number) {
	return typeof value === 'number' ? formatNumber(value) : formatString(value)
}

function formatString(s: string) {
	return JSON.stringify(s)
}

function formatNumber(n: number) {
	return Math.floor(n) === n ? n + '.0' : n + ''
}
