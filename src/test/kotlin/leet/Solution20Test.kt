package leet

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution20Test {
    private val sol = Solution20()

    @Test
    fun testValidString() {
        val validStrings = listOf(
            "()",
            "()[]{}",
            "a(b{c[d]e}f)g"
        )

        for (s in validStrings) {
            assertTrue(sol.validParentheses(s))
            assertTrue(sol.validParenthesesAlt(s))
        }
    }

    @Test
    fun testUncloseParentheses() {
        val invalidStrings = listOf(
            "(abc",
            "()[c{}",
            "a(b)c{d"
        )

        for (s in invalidStrings) {
            assertFalse(sol.validParentheses(s))
            assertFalse(sol.validParenthesesAlt(s))
        }
    }

    @Test
    fun testUnopenedParentheses() {
        val invalidStrings = listOf(
            "ab)c",
            "()c]{}",
            "a{b}c[d]e)"
        )

        for (s in invalidStrings) {
            assertFalse(sol.validParentheses(s))
            assertFalse(sol.validParenthesesAlt(s))
        }
    }

    @Test
    fun testWrongOrderParentheses() {
        val invalidStrings = listOf(
            "([)]",
            "([{})]",
            "a(b{c)d}e[f]"
        )
        for (s in invalidStrings) {
            assertFalse(sol.validParentheses(s))
            assertFalse(sol.validParenthesesAlt(s))
        }

    }
}