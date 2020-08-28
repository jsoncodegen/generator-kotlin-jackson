package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum value fields.
 */
data class JsonNumberEnumValueSiblingTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>,
	val arrayOfArraysOfEnumValues: List<List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>,
	val mapOfMapsOfEnumValues: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum.Name
}
