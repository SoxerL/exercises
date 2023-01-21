package leet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Solution27Test {
    private val sol = Solution27()

    @Test
    fun emptyArray() {
        assertEquals(0, sol.removeElement(IntArray(0), 1))
    }

    @Test
    fun noOccurences() {
        val arrays = listOf(
            intArrayOf(-5, 0, 1 , 5, -100, 55)
        )
        val numsToRemove = listOf(
            20
        )
        val expectedResults = listOf(
            intArrayOf(-5, 0, 1 , 5, -100, 55)
        )

        for (i in arrays.indices) {
            val currentInput = arrays[i]
            val currentExpectedResult = expectedResults[i]
            val resSize = sol.removeElement(currentInput, numsToRemove[i])
            assertEquals(currentExpectedResult.size, resSize)
            for (ind in 0 until resSize) {
                assertEquals(currentExpectedResult[ind], currentInput[ind])
            }
        }
    }

    @Test
    fun oneOccurence() {
        val arrays = listOf(
            intArrayOf(-5, 0, 1 , 5, -100, 55)
        )
        val numsToRemove = listOf(
            5
        )
        val expectedResults = listOf(
            intArrayOf(-5, 0, 1 , -100, 55)
        )

        for (i in arrays.indices) {
            val currentInput = arrays[i]
            val currentExpectedResult = expectedResults[i]
            val resSize = sol.removeElement(currentInput, numsToRemove[i])
            assertEquals(currentExpectedResult.size, resSize)
            for (ind in 0 until resSize) {
                assertEquals(currentExpectedResult[ind], currentInput[ind])
            }
        }
    }

    @Test
    fun multipleOccurences() {
        val arrays = listOf(
            intArrayOf(5, 5, -5, 0, 1 , 5, -100, 55)
        )
        val numsToRemove = listOf(
            5
        )
        val expectedResults = listOf(
            intArrayOf(-5, 0, 1 , -100, 55)
        )

        for (i in arrays.indices) {
            val currentInput = arrays[i]
            val currentExpectedResult = expectedResults[i]
            val resSize = sol.removeElement(currentInput, numsToRemove[i])
            assertEquals(currentExpectedResult.size, resSize)
            for (ind in 0 until resSize) {
                assertEquals(currentExpectedResult[ind], currentInput[ind])
            }
        }
    }

    @Test
    fun removeOnlyNumber() {
        val arrays = listOf(
            intArrayOf(-2, -2, -2, -2, -2, -2)
        )
        val numsToRemove = listOf(
            -2
        )
        val expectedResults = listOf(
            IntArray(0)
        )

        for (i in arrays.indices) {
            val currentInput = arrays[i]
            val currentExpectedResult = expectedResults[i]
            val resSize = sol.removeElement(currentInput, numsToRemove[i])
            assertEquals(currentExpectedResult.size, resSize)
            for (ind in 0 until resSize) {
                assertEquals(currentExpectedResult[ind], currentInput[ind])
            }
        }
    }
}