package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests boolean values.
 */
data class JsonBooleanTest(
	val flag: Boolean,
	/**
	 * This is a flag.
	 */
	val flagWithDescription: Boolean,
	val flagOrNull: Boolean? = null,
	val arrayOfFlags: List<Boolean>,
	val arrayOfArraysOfFlags: List<List<Boolean>>,
	val arrayOfFlagsAndNulls: List<Boolean?>,
	val arrayOfFlagsOrNull: List<Boolean>? = null,
	val arrayOfFlagsAndNullsOrNull: List<Boolean?>? = null,
	val mapOfFlags: Map<String, Boolean>,
	val mapOfMapsOfFlags: Map<String, Map<String, Boolean>>,
	val mapOfNullsAndFlags: Map<String, Boolean?>,
	val mapOfFlagsOrNull: Map<String, Boolean>? = null,
	val mapOfNullsAndFlagsOrNull: Map<String, Boolean?>? = null,
	val arrayOfMapsOfFlags: List<Map<String, Boolean>>,
	val arrayOfMapsOfFlagsOrNull: List<Map<String, Boolean>>? = null,
	val arrayOfNullsAndMapsOfFlags: List<Map<String, Boolean>?>,
	val arrayOfMapsOfNullsAndFlags: List<Map<String, Boolean?>>,
	val arrayOfNullsAndMapsOfNullsAndFlagsOrNull: List<Map<String, Boolean?>?>? = null,
	val mapOfArraysOfFlags: Map<String, List<Boolean>>,
	val mapOfArraysOfFlagsOrNull: Map<String, List<Boolean>>? = null,
	val mapOfNullsAndArraysOfFlags: Map<String, List<Boolean>?>,
	val mapOfArraysOfNullsAndFlags: Map<String, List<Boolean?>>,
	val mapOfNullsAndArraysOfNullsAndFlagsOrNull: Map<String, List<Boolean?>?>? = null
) {
}
