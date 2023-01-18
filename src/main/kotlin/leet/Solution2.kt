package leet

class Solution2 {
    /**
     * Two positive numbers are given as SinglyLinkedList in reverse order.
     * This method sums the two Numbers and returns the result as SinglyLinkedList in reverse order
     * this is probably not the most elegant solution
     */
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Base cases one or both null
        if (l1 == null) {
            if (l2 == null) {
                return null
            }
            return l2
        } else {
            if (l2 == null) {
                return l1
            }
        }
        var currentNode1 = l1
        var currentNode2 = l2
        var remainder = 0
        var sum = ""
        while (currentNode1 != null || currentNode2 != null) { // at least one of them does still have digits
            var tmpSum = remainder
            if (currentNode1 != null) {
                tmpSum += currentNode1.value
            }
            if (currentNode2 != null) {
                tmpSum += currentNode2.value
            }
            sum = (tmpSum % 10).toString() + sum // append to front since we start with last digit first
            remainder = tmpSum / 10
            currentNode1 = currentNode1?.next
            currentNode2 = currentNode2?.next
        }
        if (remainder > 0) {
            sum = remainder.toString() + sum
        }
        return convertStringToLinkedList(sum)
    }

    /**
     * Utility function to convert a String to the needed reverse order SinglyLinkedList
     */
    fun convertStringToLinkedList(s: String): ListNode? {
        if (s.isEmpty()) {
            return null
        }
        var firstNode = ListNode(0)
        var currentNode = ListNode(0)
        var nextNode = ListNode(0)
        for ((index, c) in s.reversed().withIndex()) {
            if (index == 0) {
                // create first Node
                firstNode = ListNode(c.digitToInt())
                // Link to nextNode if it exists
                if (s.length > 1) {
                    firstNode.next = nextNode
                }
            } else {
                currentNode.value = c.digitToInt()
                if (index < s.length - 1) {
                    // there is at least one additional digit
                    currentNode.next = nextNode
                }
            }
            currentNode = nextNode
            nextNode = ListNode(0)
        }
        return firstNode
    }
}