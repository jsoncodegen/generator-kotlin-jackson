package jsoncodegen.kotlinjacksontest

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberEnum
import org.junit.Assert.assertEquals
import org.junit.Test

class NumberEnumTest {
    @Test
    fun serializesAndDeserializes() {
        val value = listOf(JsonNumberEnum.Name, JsonNumberEnum.NameWithDescription, JsonNumberEnum.NameOfFractionValue)

        val objectMapper = jacksonObjectMapper()
        val json = objectMapper.writeValueAsString(value)

        val objectMapper2 = jacksonObjectMapper()
        val value2: List<JsonNumberEnum> = objectMapper2.readValue(json, object : TypeReference<List<JsonNumberEnum>>() {})

        assertEquals(value, value2)
    }
}
