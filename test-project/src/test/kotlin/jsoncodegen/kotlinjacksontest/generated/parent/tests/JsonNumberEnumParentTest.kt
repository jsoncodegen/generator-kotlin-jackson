package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum fields.
 */
data class JsonNumberEnumParentTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>,
	val arrayOfArraysOfEnums: List<List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>,
	val mapOfMapsOfEnums: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>?>? = null
) {
}
