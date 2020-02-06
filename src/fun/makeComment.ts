export function makeComment(description: string) {
	return description
		? `/**\n${description
				.replace(/\*\//g, '* /')
				.replace(/^/gm, ` * `)}\n */`
		: ''
}
