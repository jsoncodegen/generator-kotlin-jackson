package jsoncodegen.kotlinjacksontest

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import jsoncodegen.kotlinjacksontest.generated.parent.tests.JsonNumberTest
import org.junit.Test
import org.junit.Assert.*


class NumberTest {
    @Test
    fun serializesAndDeserializes() {
        val obj = JsonNumberTest(
                count = 3.0,
                countWithDescription = 3.14,
                arrayOfCounts = listOf(),
                arrayOfCountsAndNulls = listOf(),
                mapOfCounts = mapOf(),
                mapOfNullsAndCounts = mapOf(),
                arrayOfMapsOfCounts = listOf(),
                arrayOfNullsAndMapsOfCounts = listOf(),
                arrayOfMapsOfNullsAndCounts = listOf(),
                mapOfArraysOfCounts = mapOf(),
                mapOfNullsAndArraysOfCounts = mapOf(),
                mapOfArraysOfNullsAndCounts = mapOf()
        )
        val objectMapper = jacksonObjectMapper()
        val json = objectMapper.writeValueAsString(obj)

        val objectMapper2 = jacksonObjectMapper()
        val obj2 = objectMapper2.readValue(json, JsonNumberTest::class.java)

        assertEquals(obj, obj2)
    }
}
