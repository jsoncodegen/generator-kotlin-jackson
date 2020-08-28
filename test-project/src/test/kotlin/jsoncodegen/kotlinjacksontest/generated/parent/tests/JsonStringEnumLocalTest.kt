package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum fields.
 */
data class JsonStringEnumLocalTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>,
	val arrayOfArraysOfEnums: List<List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>,
	val mapOfMapsOfEnums: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum?>?>? = null
) {
}
