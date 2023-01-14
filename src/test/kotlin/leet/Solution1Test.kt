package leet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Solution1Test {

    private val sol = Solution1()

    @Test
    fun testSmallArrays() {
        // formats as map(target -> array)
        val inputs = listOf(
            mapOf(9 to intArrayOf(2,7,11,15)),
            mapOf(6 to intArrayOf(3,2,4)),
            mapOf(6 to intArrayOf(3,3))
        )
        val expectedResults = listOf(
            intArrayOf(0,1),
            intArrayOf(1,2),
            intArrayOf(0,1)
        )

        for ((index, input) in inputs.withIndex()) {
            val target = input.keys.first() // since there is only one key / value pair
            assertEquals(expectedResults[index].contentToString(), sol.twoSum(input[target]!!, target).contentToString())
        }
    }

    @Test
    fun testLargerArrays() {
        // formats as map(target -> array)
        val inputs = listOf(
            mapOf(23 to intArrayOf(8,2,15,26,32,70,1,4)),
            mapOf(58 to intArrayOf(32,20,14,51,8,11,33,16,2,7)),
        )
        val expectedResults = listOf(
            intArrayOf(0,2),
            intArrayOf(3,9),
        )

        for ((index, input) in inputs.withIndex()) {
            val target = input.keys.first() // since there is only one key / value pair
            assertEquals(expectedResults[index].contentToString(), sol.twoSum(input[target]!!, target).contentToString())
        }
    }

}