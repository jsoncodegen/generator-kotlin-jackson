package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum fields.
 */
data class JsonStringEnumParentTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>,
	val arrayOfArraysOfEnums: List<List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>,
	val mapOfMapsOfEnums: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>?>? = null
) {
}
