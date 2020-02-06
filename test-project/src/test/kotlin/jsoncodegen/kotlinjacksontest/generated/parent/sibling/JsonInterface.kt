package jsoncodegen.kotlinjacksontest.generated.parent.sibling

import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * This is an interface.
 */
data class JsonInterface(
	@JsonIgnore val __dummyParameterPleaseIgnore__: __Dummy__ = __Dummy__.Param
) {
	enum class __Dummy__ { Param }
}
