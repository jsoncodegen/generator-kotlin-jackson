package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum fields.
 */
data class JsonStringEnumRootTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.JsonStringEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.JsonStringEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.JsonStringEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>,
	val arrayOfArraysOfEnums: List<List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>,
	val mapOfMapsOfEnums: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>?>? = null
) {
}
