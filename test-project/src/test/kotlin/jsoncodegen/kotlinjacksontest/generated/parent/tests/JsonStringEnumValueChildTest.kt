package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests string enum value fields.
 */
data class JsonStringEnumValueChildTest(
	val arrayOfEnumValues: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>,
	val arrayOfArraysOfEnumValues: List<List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>>,
	val arrayOfEnumValuesAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>,
	val arrayOfEnumValuesOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>? = null,
	val arrayOfEnumValuesAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>? = null,
	val mapOfEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>,
	val mapOfMapsOfEnumValues: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>>,
	val mapOfNullsAndEnumValues: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>,
	val mapOfEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>? = null,
	val mapOfNullsAndEnumValuesOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>? = null,
	val arrayOfMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>>,
	val arrayOfMapsOfEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>>? = null,
	val arrayOfNullsAndMapsOfEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>?>,
	val arrayOfMapsOfNullsAndEnumValues: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>>,
	val arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>?>? = null,
	val mapOfArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>>,
	val mapOfArraysOfEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>>? = null,
	val mapOfNullsAndArraysOfEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum>?>,
	val mapOfArraysOfNullsAndEnumValues: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>>,
	val mapOfNullsAndArraysOfNullsAndEnumValuesOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum?>?>? = null
) {
	val enumValue = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum.Name
	/**
	 * This is an enum value.
	 */
	val enumValueWithDescription = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum.Name
	val enumValueOrNull = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum.Name
}
