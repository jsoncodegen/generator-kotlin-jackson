package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum value fields.
 */
data class JsonNumberEnumValueParentTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum.Name
}
