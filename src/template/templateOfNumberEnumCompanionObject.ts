export function templateOfNumberEnumCompanionObject({
	name,
}: {
	name: string
}) {
	return `companion object {

	private val enumsByValues = mutableMapOf<Double, ${name}>()

	init {
		for (e in values()) {
			enumsByValues[e.value] = e
		}
	}

	@JsonCreator
	@JvmStatic
	fun fromValue(value: Double): ${name} {
		val e = enumsByValues[value]
		return e ?: throw IllegalArgumentException(value.toString())
	}
}`
}
