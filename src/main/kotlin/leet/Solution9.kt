package leet

class Solution9 {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        val s = x.toString()
        var counter = 0
        while (counter < s.length/2) {
            if (s.elementAt(counter) != s.elementAt(s.length - counter - 1)) return false
            ++counter
        }
        return true
    }

    fun isPalindromeAlt(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        var reversed = 0
        var tmp = x
        while (tmp != 0) {
            reversed = reversed * 10 + tmp % 10
            tmp /= 10
        }
        return x == reversed
    }
}