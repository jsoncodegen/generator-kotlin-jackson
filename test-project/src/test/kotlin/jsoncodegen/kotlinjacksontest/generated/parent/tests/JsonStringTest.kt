package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string values.
 */
data class JsonStringTest(
	val name: String,
	/**
	 * This is a name.
	 */
	val nameWithDescription: String,
	val nameOrNull: String? = null,
	val arrayOfNames: List<String>,
	val arrayOfNamesAndNulls: List<String?>,
	val arrayOfNamesOrNull: List<String>? = null,
	val arrayOfNamesAndNullsOrNull: List<String?>? = null,
	val mapOfNames: Map<String, String>,
	val mapOfNullsAndNames: Map<String, String?>,
	val mapOfNamesOrNull: Map<String, String>? = null,
	val mapOfNullsAndNamesOrNull: Map<String, String?>? = null,
	val arrayOfMapsOfNames: List<Map<String, String>>,
	val arrayOfMapsOfNamesOrNull: List<Map<String, String>>? = null,
	val arrayOfNullsAndMapsOfNames: List<Map<String, String>?>,
	val arrayOfMapsOfNullsAndNames: List<Map<String, String?>>,
	val arrayOfNullsAndMapsOfNullsAndNamesOrNull: List<Map<String, String?>?>? = null,
	val mapOfArraysOfNames: Map<String, List<String>>,
	val mapOfArraysOfNamesOrNull: Map<String, List<String>>? = null,
	val mapOfNullsAndArraysOfNames: Map<String, List<String>?>,
	val mapOfArraysOfNullsAndNames: Map<String, List<String?>>,
	val mapOfNullsAndArraysOfNullsAndNamesOrNull: Map<String, List<String?>?>? = null
) {
}
