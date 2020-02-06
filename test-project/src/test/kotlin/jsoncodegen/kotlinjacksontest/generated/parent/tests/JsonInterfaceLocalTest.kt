package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests interface fields.
 */
data class JsonInterfaceLocalTest(
	val object_: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface,
	/**
	 * This is an object.
	 */
	val objectWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface,
	val objectOrNull: jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface? = null,
	val arrayOfObjects: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>,
	val arrayOfObjectsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>,
	val arrayOfObjectsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>? = null,
	val arrayOfObjectsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>? = null,
	val mapOfObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>,
	val mapOfNullsAndObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>,
	val mapOfObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>? = null,
	val mapOfNullsAndObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>? = null,
	val arrayOfMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>>,
	val arrayOfMapsOfObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>>? = null,
	val arrayOfNullsAndMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>?>,
	val arrayOfMapsOfNullsAndObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>>,
	val arrayOfNullsAndMapsOfNullsAndObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>?>? = null,
	val mapOfArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>>,
	val mapOfArraysOfObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>>? = null,
	val mapOfNullsAndArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface>?>,
	val mapOfArraysOfNullsAndObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>>,
	val mapOfNullsAndArraysOfNullsAndObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonInterface?>?>? = null
) {
}
