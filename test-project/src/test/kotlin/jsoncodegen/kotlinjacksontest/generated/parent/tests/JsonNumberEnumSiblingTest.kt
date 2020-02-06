package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum fields.
 */
data class JsonNumberEnumSiblingTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>?>? = null
) {
}
