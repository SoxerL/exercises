package leet

class Solution20 {

    /**
     * This function checks if a string contains valid parentheses.
     * Meaning each has been closed and in the right order
     */
    fun validParentheses(s: String): Boolean {
        val lookup = mapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{'
        )
        val stack = ArrayDeque<Char>()
        for (c in s) {
            if (c in lookup.values) {
                stack.addFirst(c)
            } else if (c in lookup.keys) {
                if (stack.isEmpty() || lookup[c] != stack.removeFirst()) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }

    fun validParenthesesAlt(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            // could also be a when (switch) statement
            if (c == '(' || c == '[' || c == '{') {
                stack.addFirst(c)
            } else if (c == ')') {
                if (stack.isEmpty() || '(' != stack.removeFirst()) {
                    return false
                }
            } else  if (c == ']') {
                if (stack.isEmpty() || '[' != stack.removeFirst()) {
                    return false
                }
            } else  if (c == '}') {
                if (stack.isEmpty() || '{' != stack.removeFirst()) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}