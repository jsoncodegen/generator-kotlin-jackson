package jsoncodegen.kotlinjacksontest.generated.parent.tests

import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * This tests number enum value fields.
 */
data class JsonNumberEnumValueMixedTest(
	@JsonIgnore val __dummyParameterPleaseIgnore__: __Dummy__ = __Dummy__.Param
) {
	enum class __Dummy__ { Param }
	val child = jsoncodegen.kotlinjacksontest.generated.parent.tests.child.JsonNumberEnum.Name
	val local = jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum.Name
	val parent = jsoncodegen.kotlinjacksontest.generated.parent.JsonNumberEnum.Name
	val root = jsoncodegen.kotlinjacksontest.generated.JsonNumberEnum.Name
	val sibling = jsoncodegen.kotlinjacksontest.generated.parent.sibling.JsonNumberEnum.Name
}
