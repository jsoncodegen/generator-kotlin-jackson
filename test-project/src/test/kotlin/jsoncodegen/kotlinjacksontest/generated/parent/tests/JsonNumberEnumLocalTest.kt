package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum fields.
 */
data class JsonNumberEnumLocalTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>,
	val arrayOfArraysOfEnums: List<List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>,
	val mapOfMapsOfEnums: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum?>?>? = null
) {
}
