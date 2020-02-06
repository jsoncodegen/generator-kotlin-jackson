package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum value fields.
 */
data class JsonNumberEnumValueRootTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum.Name
}
