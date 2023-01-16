package leet

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class Solution9Test {
    private val sol = Solution9()

    @Test
    fun isPalindromeTrue() {
        val nums = listOf(
            121,
            123321,
            782353287
        )
        for (num in nums) {
            assertTrue(sol.isPalindrome(num))
            assertTrue(sol.isPalindromeAlt(num))
        }
    }

    @Test
    fun isPalindromeFalse() {
        // given
        val nums = listOf(
            12,
            -121,
            10,
            12345321
        )

        for (num in nums) {
            assertFalse(sol.isPalindrome(num))
            assertFalse(sol.isPalindromeAlt(num))
        }
    }
}