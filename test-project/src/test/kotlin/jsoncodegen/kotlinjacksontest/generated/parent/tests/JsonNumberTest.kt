package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number values.
 */
data class JsonNumberTest(
	val count: Double,
	/**
	 * This is a count.
	 */
	val countWithDescription: Double,
	val countOrNull: Double? = null,
	val arrayOfCounts: List<Double>,
	val arrayOfCountsAndNulls: List<Double?>,
	val arrayOfCountsOrNull: List<Double>? = null,
	val arrayOfCountsAndNullsOrNull: List<Double?>? = null,
	val mapOfCounts: Map<String, Double>,
	val mapOfNullsAndCounts: Map<String, Double?>,
	val mapOfCountsOrNull: Map<String, Double>? = null,
	val mapOfNullsAndCountsOrNull: Map<String, Double?>? = null,
	val arrayOfMapsOfCounts: List<Map<String, Double>>,
	val arrayOfMapsOfCountsOrNull: List<Map<String, Double>>? = null,
	val arrayOfNullsAndMapsOfCounts: List<Map<String, Double>?>,
	val arrayOfMapsOfNullsAndCounts: List<Map<String, Double?>>,
	val arrayOfNullsAndMapsOfNullsAndCountsOrNull: List<Map<String, Double?>?>? = null,
	val mapOfArraysOfCounts: Map<String, List<Double>>,
	val mapOfArraysOfCountsOrNull: Map<String, List<Double>>? = null,
	val mapOfNullsAndArraysOfCounts: Map<String, List<Double>?>,
	val mapOfArraysOfNullsAndCounts: Map<String, List<Double?>>,
	val mapOfNullsAndArraysOfNullsAndCountsOrNull: Map<String, List<Double?>?>? = null
) {
}
