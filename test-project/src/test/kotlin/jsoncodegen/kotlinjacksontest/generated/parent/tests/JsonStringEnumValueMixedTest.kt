package jsoncodegen.kotlinjacksontest.generated.parent.tests

import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * This tests string enum value fields.
 */
data class JsonStringEnumValueMixedTest(
	@JsonIgnore val __dummyParameterPleaseIgnore__: __Dummy__ = __Dummy__.Param
) {
	enum class __Dummy__ { Param }
	val child = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonStringEnum.Name
	val local = jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum.Name
	val parent = jsoncodegen.kotlinjacksontest.generated.parent.JsonStringEnum.Name
	val root = jsoncodegen.kotlinjacksontest.generated.JsonStringEnum.Name
	val sibling = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonStringEnum.Name
}
