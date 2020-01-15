package com.aescolar.stringcalculator

import org.junit.Test

const val emptyArgs = ""
const val oneArg = "1"
const val twoArgs = "1,2"
const val manyArgs = "1,2,3,4"
const val differentDelimiters = "1\n2\n2"

class StringCalculatorTest {

    @Test
    fun `when empty args then result is 0`() {
        val result = calculateString(emptyArgs)

        assert(result == 0)
    }

    @Test
    fun `when one arg then result is the same`() {
        val result = calculateString(oneArg)

        assert(result == 1)
    }

    @Test
    fun `when two args then result is their sum`() {
        val result = calculateString(twoArgs)

        assert(result == 3)
    }

   @Test
   fun `when any amount of args then result is their sum`() {
       val result = calculateString(manyArgs)

       assert(result == 10)
   }

    @Test
    fun `when any amount of args and different delimiters then result is their sum`() {
        val result = calculateString(differentDelimiters)

        assert(result == 5)
    }
}