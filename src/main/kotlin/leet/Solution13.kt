package leet

class Solution13 {

    private val romanToIntMapping = mapOf(
        "I" to 1,
        "IV" to 4,
        "V" to 5,
        "IX" to 9,
        "X" to 10,
        "XL" to 40,
        "L" to 50,
        "XC" to 90,
        "C" to 100,
        "CD" to 400,
        "D" to 500,
        "CM" to 900,
        "M" to 1000
    )
    fun romanToInt(s: String): Int {
        var sum = 0
        var index = 0
        while (index < s.length) {
            var currentNumber = 0
            if (index + 1 <= s.length) {
                currentNumber = romanToIntMapping[s.substring(index, index + 1)]!!
            }
            if (index + 2 <= s.length && romanToIntMapping.contains(s.substring(index, index + 2))) {
                currentNumber = romanToIntMapping[s.substring(index, index + 2)]!!
                ++index
            }
            sum += currentNumber
            ++index
        }
        return sum
    }
}