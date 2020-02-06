package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum value fields.
 */
data class JsonStringEnumValueParentTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum.Name
}
