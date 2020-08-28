package jsoncodegen.kotlinjacksontest.generated.parent.tests

/**
 * This tests interface fields.
 */
data class JsonInterfaceRootTest(
	val object_: jsoncodegen.kotlinjacksontest.generated.JsonInterface,
	/**
	 * This is an object.
	 */
	val objectWithDescription: jsoncodegen.kotlinjacksontest.generated.JsonInterface,
	val objectOrNull: jsoncodegen.kotlinjacksontest.generated.JsonInterface? = null,
	val arrayOfObjects: List<jsoncodegen.kotlinjacksontest.generated.JsonInterface>,
	val arrayOfArraysOfObjects: List<List<jsoncodegen.kotlinjacksontest.generated.JsonInterface>>,
	val arrayOfObjectsAndNulls: List<jsoncodegen.kotlinjacksontest.generated.JsonInterface?>,
	val arrayOfObjectsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonInterface>? = null,
	val arrayOfObjectsAndNullsOrNull: List<jsoncodegen.kotlinjacksontest.generated.JsonInterface?>? = null,
	val mapOfObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface>,
	val mapOfMapsOfObjects: Map<String, Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface>>,
	val mapOfNullsAndObjects: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface?>,
	val mapOfObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface>? = null,
	val mapOfNullsAndObjectsOrNull: Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface?>? = null,
	val arrayOfMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface>>,
	val arrayOfMapsOfObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface>>? = null,
	val arrayOfNullsAndMapsOfObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface>?>,
	val arrayOfMapsOfNullsAndObjects: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface?>>,
	val arrayOfNullsAndMapsOfNullsAndObjectsOrNull: List<Map<String, jsoncodegen.kotlinjacksontest.generated.JsonInterface?>?>? = null,
	val mapOfArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonInterface>>,
	val mapOfArraysOfObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonInterface>>? = null,
	val mapOfNullsAndArraysOfObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonInterface>?>,
	val mapOfArraysOfNullsAndObjects: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonInterface?>>,
	val mapOfNullsAndArraysOfNullsAndObjectsOrNull: Map<String, List<jsoncodegen.kotlinjacksontest.generated.JsonInterface?>?>? = null
) {
}
