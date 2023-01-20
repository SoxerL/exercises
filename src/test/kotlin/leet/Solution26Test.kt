package leet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Solution26Test {
    private val sol = Solution26()

    @Test
    fun emptyArray() {
        assertEquals(0, sol.removeDuplicates(IntArray(0)))
    }

    @Test
    fun noDuplicates() {
        val inputsA = listOf(
            intArrayOf(1),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        )
        val inputsB = listOf(
            intArrayOf(1),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        )


        val expectedResults = listOf(
            intArrayOf(1),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        )


        for (i in inputsA.indices) {
            val resA = sol.removeDuplicates(inputsA[i])
            val resB = sol.removeDuplicateAlt(inputsB[i])
            assertEquals(expectedResults[i].size, resA)
            assertEquals(expectedResults[i].size, resB)
            for (j in 0 until resA) {
                assertEquals(expectedResults[i][j], inputsA[i][j])
                assertEquals(expectedResults[i][j], inputsB[i][j])
            }
        }
    }

    @Test
    fun oneDuplicate() {
        val inputsA = listOf(
            intArrayOf(1, 1),
            intArrayOf(1, 2, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 15)
        )
        val inputsB = listOf(
            intArrayOf(1, 1),
            intArrayOf(1, 2, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 15)
        )

        val expectedResults = listOf(
            intArrayOf(1),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        )


        for (i in inputsA.indices) {
            val resA = sol.removeDuplicates(inputsA[i])
            val resB = sol.removeDuplicateAlt(inputsB[i])
            assertEquals(expectedResults[i].size, resA)
            assertEquals(expectedResults[i].size, resB)
            for (j in 0 until resA) {
                assertEquals(expectedResults[i][j], inputsA[i][j])
                assertEquals(expectedResults[i][j], inputsB[i][j])
            }
        }
    }

    @Test
    fun multipleDuplicates() {
        val inputsA = listOf(
            intArrayOf(1, 1, 2, 2),
            intArrayOf(1, 1, 2, 2, 3, 3, 4, 5, 5),
            intArrayOf(1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 13, 14, 15, 15)
        )
        val inputsB = listOf(
            intArrayOf(1, 1, 2, 2),
            intArrayOf(1, 1, 2, 2, 3, 3, 4, 5, 5),
            intArrayOf(1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 13, 14, 15, 15)
        )

        val expectedResults = listOf(
            intArrayOf(1, 2),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        )


        for (i in inputsA.indices) {
            val resA = sol.removeDuplicates(inputsA[i])
            val resB = sol.removeDuplicateAlt(inputsB[i])
            assertEquals(expectedResults[i].size, resA)
            assertEquals(expectedResults[i].size, resB)
            for (j in 0 until resA) {
                assertEquals(expectedResults[i][j], inputsA[i][j])
                assertEquals(expectedResults[i][j], inputsB[i][j])
            }
        }
    }

    @Test
    fun moreThanTwoTimesSameNumber() {
        val inputs = listOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 2, 2, 2, 3, 4, 5, 5),
            intArrayOf(1, 1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8, 9, 10, 11, 12, 12, 13, 14, 15, 15, 15)
        )

        val expectedResults = listOf(
            intArrayOf(1),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        )


        for (i in inputs.indices) {
            val k = sol.removeDuplicates(inputs[i])
            assertEquals(expectedResults[i].size, k)
            for (j in 0 until k) {
                assertEquals(expectedResults[i][j], inputs[i][j])
            }
        }
    }
}