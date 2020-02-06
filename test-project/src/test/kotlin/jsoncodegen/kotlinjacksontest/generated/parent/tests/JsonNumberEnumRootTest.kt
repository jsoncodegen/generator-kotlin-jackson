package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum fields.
 */
data class JsonNumberEnumRootTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>?>? = null
) {
}
