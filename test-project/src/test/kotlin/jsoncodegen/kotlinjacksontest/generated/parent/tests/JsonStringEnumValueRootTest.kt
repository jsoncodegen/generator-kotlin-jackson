package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum value fields.
 */
data class JsonStringEnumValueRootTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonStringEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.JsonStringEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.JsonStringEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.JsonStringEnum.Name
}
