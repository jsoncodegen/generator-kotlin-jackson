package jsoncodegen.kotlinjacksontest.generated.parent.sibling

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
 * This is a number enum.
 */
enum class JsonNumberEnum(@get:JsonValue val value: Double) {
	Name(0.0),
	/**
	 * This is a value.
	 */
	NameWithDescription(1.0),
	NameOfFractionValue(3.14),
	;

	companion object {

		private val enumsByValues = mutableMapOf<Double, JsonNumberEnum>()

		init {
			for (e in values()) {
				enumsByValues[e.value] = e
			}
		}

		@JsonCreator
		@JvmStatic
		fun fromValue(value: Double): JsonNumberEnum {
			val e = enumsByValues[value]
			return e ?: throw IllegalArgumentException(value.toString())
		}
	}
}
