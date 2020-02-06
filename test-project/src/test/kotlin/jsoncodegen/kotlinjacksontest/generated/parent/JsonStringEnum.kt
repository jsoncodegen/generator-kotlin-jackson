package jsoncodegen.kotlinjacksontest.generated.parent

import com.fasterxml.jackson.annotation.JsonValue

/**
 * This is a string enum.
 */
enum class JsonStringEnum(@get:JsonValue val value: String) {
	Name("Value"),
	/**
	 * This is a value.
	 */
	NameWithDescription("ValueWithDescription"),
	NameOfEmptyValue(""),
}
