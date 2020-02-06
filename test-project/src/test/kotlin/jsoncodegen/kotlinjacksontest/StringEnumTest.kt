package jsoncodegen.kotlinjacksontest

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonStringEnum
import org.junit.Assert.assertEquals
import org.junit.Test

class StringEnumTest {
    @Test
    fun serializesAndDeserializes() {
        val value = listOf(JsonStringEnum.Name, JsonStringEnum.NameWithDescription, JsonStringEnum.NameOfEmptyValue)

        val objectMapper = jacksonObjectMapper()
        val json = objectMapper.writeValueAsString(value)

        val objectMapper2 = jacksonObjectMapper()
        val value2: List<JsonStringEnum> = objectMapper2.readValue(json, object : TypeReference<List<JsonStringEnum>>() {})

        assertEquals(value, value2)
    }
}
