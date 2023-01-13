package leet

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Solution13Tests {

    private val sol = Solution13()

    @Test
    fun romanToIntStandardPatterns() {
        val patterns = listOf(
            "I",
            "V",
            "X",
            "L",
            "C",
            "D",
            "M"
        )

        val numbers = listOf(
            1,
            5,
            10,
            50,
            100,
            500,
            1000
        )

        for ((index, pattern) in patterns.withIndex()) {
            Assertions.assertEquals(numbers[index], sol.romanToInt(pattern))
        }
    }

    @Test
    fun romanToIntAdvancedPatterns() {
        val patterns = listOf(
            "II",
            "IV",
            "VI",
            "IX",
            "XI",
            "XL",
            "LX",
            "XC",
            "CX",
            "CD",
            "DC",
            "CM",
            "MC"
        )

        val numbers = listOf(
            2,
            4,
            6,
            9,
            11,
            40,
            60,
            90,
            110,
            400,
            600,
            900,
            1100
        )

        for ((index, pattern) in patterns.withIndex()) {
            Assertions.assertEquals(numbers[index], sol.romanToInt(pattern))
        }
    }

    @Test
    fun romanToIntAllowedCombinations() {
        val patterns = listOf(
            "VIII",
            "XIV",
            "XIX",
            "LVIII",
            "LXXX",
            "CMXCIX",
            "MCMLXXXVIII",
            "MCMXCIV"
        )
        val numbers = listOf(
            8,
            14,
            19,
            58,
            80,
            999,
            1988,
            1994
        )
        for ((index, pattern) in patterns.withIndex()) {
            Assertions.assertEquals(numbers[index], sol.romanToInt(pattern))
        }
    }
}