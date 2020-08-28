package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests interface fields.
 */
data class JsonInterfaceChildTest(
	val object_: jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface,
	/**
	 * This is an object.
	 */
	val objectWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface,
	val objectOrNull: jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface? = null,
	val arrayOfObjects: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>,
	val arrayOfArraysOfObjects: List<List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>>,
	val arrayOfObjectsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>,
	val arrayOfObjectsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>? = null,
	val arrayOfObjectsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>? = null,
	val mapOfObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>,
	val mapOfMapsOfObjects: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>>,
	val mapOfNullsAndObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>,
	val mapOfObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>? = null,
	val mapOfNullsAndObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>? = null,
	val arrayOfMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>>,
	val arrayOfMapsOfObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>>? = null,
	val arrayOfNullsAndMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>?>,
	val arrayOfMapsOfNullsAndObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>>,
	val arrayOfNullsAndMapsOfNullsAndObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>?>? = null,
	val mapOfArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>>,
	val mapOfArraysOfObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>>? = null,
	val mapOfNullsAndArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface>?>,
	val mapOfArraysOfNullsAndObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>>,
	val mapOfNullsAndArraysOfNullsAndObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonInterface?>?>? = null
) {
}
