package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum value fields.
 */
data class JsonStringEnumValueSiblingTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>,
	val arrayOfArraysOfEnumValues: List<List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>,
	val mapOfMapsOfEnumValues: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum.Name
}
