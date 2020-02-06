package jsoncodegen.kotlinjacksontest

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonBooleanTest
import org.junit.Test
import org.junit.Assert.*


class BooleanTest {
    @Test
    fun serializesAndDeserializes() {
        val obj = JsonBooleanTest(
                flag = true,
                flagWithDescription = true,
                arrayOfFlags = listOf(),
                arrayOfFlagsAndNulls = listOf(),
                mapOfFlags = mapOf(),
                mapOfNullsAndFlags = mapOf(),
                arrayOfMapsOfFlags = listOf(),
                arrayOfNullsAndMapsOfFlags = listOf(),
                arrayOfMapsOfNullsAndFlags = listOf(),
                mapOfArraysOfFlags = mapOf(),
                mapOfNullsAndArraysOfFlags = mapOf(),
                mapOfArraysOfNullsAndFlags = mapOf()
        )
        val objectMapper = jacksonObjectMapper()
        val json = objectMapper.writeValueAsString(obj)

        val objectMapper2 = jacksonObjectMapper()
        val obj2 = objectMapper2.readValue(json, JsonBooleanTest::class.java)

        assertEquals(obj, obj2)
    }
}
