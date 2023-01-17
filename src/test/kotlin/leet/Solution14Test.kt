package leet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Solution14Test {

    private val sol = Solution14()

    @Test
    fun noPrefix() {
        val input = arrayOf("dog", "racecar", "car")
        val result = sol.longestCommonPrefix(input)
        assertEquals("", result)
    }

    @Test
    fun smallPrefix() {
        val input = arrayOf("flower", "flow", "flight")
        val result = sol.longestCommonPrefix(input)
        assertEquals("fl", result)

        val inputB = arrayOf("ab", "a")
        val resultB = sol.longestCommonPrefix(inputB)
        assertEquals("a", resultB)
    }

    @Test
    fun longPrefix() {
        val input = arrayOf("abc123def99mmnn", "abc123defracecar", "abc123defcaabc123defr")
        val result = sol.longestCommonPrefix(input)
        assertEquals("abc123def", result)
    }

    @Test
    fun singularInput() {
        val input = arrayOf("a")
        val result = sol.longestCommonPrefix(input)
        assertEquals("a", result)
    }
}