package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum fields.
 */
data class JsonStringEnumSiblingTest(
	val enum_: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum,
	/**
	 * This is an enum.
	 */
	val enumWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum,
	val enumOrNull: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum? = null,
	val arrayOfEnums: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>,
	val arrayOfEnumsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>,
	val arrayOfEnumsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>? = null,
	val arrayOfEnumsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>? = null,
	val mapOfEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>,
	val mapOfNullsAndEnums: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>,
	val mapOfEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>? = null,
	val mapOfNullsAndEnumsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>,
	val arrayOfMapsOfEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnums: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>,
	val mapOfArraysOfEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnums: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>?>? = null
) {
}
