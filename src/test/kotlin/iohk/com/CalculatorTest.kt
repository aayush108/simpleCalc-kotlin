package iohk.com

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class CalculatorTest {
    // Tests on this class are left empty to validate the test coverage reported
    // by jacoco on the cucumber results.
    // Most applications i've worked with will have a mix of unit tests using junit
    // and component tests using cucumber, so the test coverage should consider both
    // types of test.

    companion object {
        @JvmStatic
        fun addition() = listOf(
            Arguments.of(1, 1, 2),
            Arguments.of(2, 4, 6),
            Arguments.of(3, 9, 12)
        )

        @JvmStatic
        fun multiplication() = listOf(
            Arguments.of(5.5, 1, 5.5),
            Arguments.of(0, 4, 0),
            Arguments.of(10.8, 9, 97.2)
        )
        @JvmStatic
        fun evens() = listOf(
            Arguments.of(intArrayOf(22, 2, 36, 64, 56),180),
            Arguments.of(intArrayOf(1, 3, 97, 43, 5),0),
            Arguments.of(intArrayOf(1, 21, 33, 4, 5),4)
        )
    }

    @ParameterizedTest(name = "Addition of integers {0} and {1} should be equal to {2}")
    @MethodSource("addition")
    fun `test addition of integers`(input1: Int, input2: Int, expected:Int) {
        assertEquals(expected, SimpleCalc.add(input1,input2))
    }

    @ParameterizedTest(name = "{0} multiplied by {1} is equal to {2}}")
    @MethodSource("multiplication")
    fun `test multiplication of numbers`(input1: Double, input2: Double, expected:Double) {
        assertEquals(expected, SimpleCalc.multiply(input1,input2))
    }

    @ParameterizedTest(name = "Sums of even numbers in an array")
    @MethodSource("evens")
    fun `sum of evens in an array`(input1: IntArray, expected:Int) {
        assertEquals(expected, SimpleCalc.sumOffEvens(input1))
    }

}