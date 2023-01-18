package leet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class Solution21Test {
    private val sol = Solution21()

    @Test
    fun testEmptyList() {
        val result = sol.mergeTwoLists(null, null)
        assertNull(result)
    }

    @Test
    fun testEvenLists() {
        val firstLinked = ListNode(1)
        val secondNode = ListNode(2)
        firstLinked.next = secondNode
        val thirdNode = ListNode(5)
        secondNode.next = thirdNode

        val firstLinkedB = ListNode(3)
        val secondNodeB = ListNode(5)
        firstLinkedB.next = secondNodeB
        val thirdNodeB = ListNode(11)
        secondNodeB.next = thirdNodeB

        // check results
        val result = sol.mergeTwoLists(firstLinked, firstLinkedB)

        var tmp = result
        val expectedResult = listOf(1,2,3,5,5,11)
        for (num in expectedResult) {
            val value = tmp?.value
            assertEquals(num, value)
            tmp = tmp?.next
        }
    }

    @Test
    fun testUnevenLists() {
        val firstLinked = ListNode(1)
        val secondNode = ListNode(2)
        firstLinked.next = secondNode
        val thirdNode = ListNode(5)
        secondNode.next = thirdNode

        val firstLinkedB = ListNode(3)
        val secondNodeB = ListNode(5)
        firstLinkedB.next = secondNodeB
        val thirdNodeB = ListNode(11)
        secondNodeB.next = thirdNodeB
        val fourthNodeB = ListNode(12)
        thirdNodeB.next = fourthNodeB
        val fifthNodeB = ListNode(13)
        fourthNodeB.next = fifthNodeB

        // check results
        val result = sol.mergeTwoLists(firstLinked, firstLinkedB)

        var tmp = result
        val expectedResult = listOf(1,2,3,5,5,11,12,13)
        for (num in expectedResult) {
            val value = tmp?.value
            assertEquals(num, value)
            tmp = tmp?.next
        }
    }
}