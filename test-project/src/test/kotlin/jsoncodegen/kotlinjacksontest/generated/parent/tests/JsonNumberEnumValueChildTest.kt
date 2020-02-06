package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests number enum value fields.
 */
data class JsonNumberEnumValueChildTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum.Name
}
