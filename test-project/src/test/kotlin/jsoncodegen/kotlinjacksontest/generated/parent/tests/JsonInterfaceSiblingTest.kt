package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests interface fields.
 */
data class JsonInterfaceSiblingTest(
	val object_: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface,
	/**
	 * This is an object.
	 */
	val objectWithDescription: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface,
	val objectOrNull: jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface? = null,
	val arrayOfObjects: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>,
	val arrayOfObjectsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>,
	val arrayOfObjectsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>? = null,
	val arrayOfObjectsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>? = null,
	val mapOfObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>,
	val mapOfNullsAndObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>,
	val mapOfObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>? = null,
	val mapOfNullsAndObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>? = null,
	val arrayOfMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>>,
	val arrayOfMapsOfObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>>? = null,
	val arrayOfNullsAndMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>?>,
	val arrayOfMapsOfNullsAndObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>>,
	val arrayOfNullsAndMapsOfNullsAndObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>?>? = null,
	val mapOfArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>>,
	val mapOfArraysOfObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>>? = null,
	val mapOfNullsAndArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface>?>,
	val mapOfArraysOfNullsAndObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>>,
	val mapOfNullsAndArraysOfNullsAndObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonInterface?>?>? = null
) {
}
