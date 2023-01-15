package leet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Solution2Test {
    private val sol = Solution2()

    @Test
    fun testConvertStringToLinkedList() {
        val firstNode = ListNode(3)
        val secondNode = ListNode(2)
        val thirdNode = ListNode(1)
        firstNode.next = secondNode
        secondNode.next = thirdNode

        // check result
        var currentExpectedNode = firstNode
        var currentActualNode = sol.convertStringToLinkedList(123.toString())!!
        while (currentExpectedNode.next != null && currentActualNode.next != null) {
            assertEquals(currentExpectedNode.value, currentActualNode.value)
            // next can't be null as asserted in while condition
            currentExpectedNode = currentExpectedNode.next!!
            currentActualNode = currentActualNode.next!!
        }
        // Still need to check the last values
        assertEquals(currentExpectedNode.value, currentActualNode.value)
    }

    @Test
    fun testFirstNullInput() {
        // 123 + null = 123
        // Using strings is easier to reverse and get "digits" even thought it needs some conversion
        // instead of doing some %10 and /10 calculations
        val firstLinked: ListNode? = null
        val secondLinked = sol.convertStringToLinkedList("123")!!
        val expectedResultLinked = sol.convertStringToLinkedList("123")!!

        // check result
        var currentExpectedNode = expectedResultLinked
        var currentActualNode = sol.addTwoNumbers(firstLinked, secondLinked)!! // must at least return one Node
        while (currentExpectedNode.next != null || currentActualNode.next != null) {
            assertEquals(currentExpectedNode.value, currentActualNode.value)
            // next can't be null as asserted in while condition
            currentExpectedNode = currentExpectedNode.next!!
            currentActualNode = currentActualNode.next!!
        }
        // Still need to check the last values
        assertEquals(currentExpectedNode.value, currentActualNode.value)
    }

    @Test
    fun testSecondNullInput() {
        // 123 + null = 123
        // Using strings is easier to reverse and get "digits" even thought it needs some conversion
        // instead of doing some %10 and /10 calculations
        val firstLinked = sol.convertStringToLinkedList("123")!!
        val secondLinked: ListNode? = null
        val expectedResultLinked = sol.convertStringToLinkedList("123")!!

        // check result
        var currentExpectedNode = expectedResultLinked
        var currentActualNode = sol.addTwoNumbers(firstLinked, secondLinked)!! // must at least return one Node
        while (currentExpectedNode.next != null || currentActualNode.next != null) {
            assertEquals(currentExpectedNode.value, currentActualNode.value)
            // next can't be null as asserted in while condition
            currentExpectedNode = currentExpectedNode.next!!
            currentActualNode = currentActualNode.next!!
        }
        // Still need to check the last values
        assertEquals(currentExpectedNode.value, currentActualNode.value)
    }

    @Test
    fun testSameLengthInput() {
        // 342 + 465 = 807
        // Using strings is easier to reverse and get "digits" even thought it needs some conversion
        // instead of doing some %10 and /10 calculations
        val firstLinked = sol.convertStringToLinkedList("342")!!
        val secondLinked = sol.convertStringToLinkedList("465")!!
        val expectedResultLinked = sol.convertStringToLinkedList("807")!!

        // check result
        var currentExpectedNode = expectedResultLinked
        var currentActualNode = sol.addTwoNumbers(firstLinked, secondLinked)!! // must at least return one Node
        while (currentExpectedNode.next != null || currentActualNode.next != null) {
            assertEquals(currentExpectedNode.value, currentActualNode.value)
            // next can't be null as asserted in while condition
            currentExpectedNode = currentExpectedNode.next!!
            currentActualNode = currentActualNode.next!!
        }
        // Still need to check the last values
        assertEquals(currentExpectedNode.value, currentActualNode.value)
    }

    @Test
    fun testZeroInput() {
        // 0 + 0 = 0
        val firstLinked = sol.convertStringToLinkedList("0")!!
        val secondLinked = sol.convertStringToLinkedList("0")!!
        val expectedResultLinked = sol.convertStringToLinkedList("0")!!

        // check result
        var currentExpectedNode = expectedResultLinked
        var currentActualNode = sol.addTwoNumbers(firstLinked, secondLinked)!! // must at least return one Node
        while (currentExpectedNode.next != null || currentActualNode.next != null) {
            assertEquals(currentExpectedNode.value, currentActualNode.value)
            // next can't be null as asserted in while condition
            currentExpectedNode = currentExpectedNode.next!!
            currentActualNode = currentActualNode.next!!
        }
        // Still need to check the last values
        assertEquals(currentExpectedNode.value, currentActualNode.value)
    }

    @Test
    fun testDifferentLengthInput() {
        // 9999 + 9999999 = 10009998
        val firstLinked = sol.convertStringToLinkedList("9999")!!
        val secondLinked = sol.convertStringToLinkedList("9999999")!!
        val expectedResultLinked = sol.convertStringToLinkedList("10009998")!!

        // check result
        var currentExpectedNode = expectedResultLinked
        var currentActualNode = sol.addTwoNumbers(firstLinked, secondLinked)!! // must at least return one Node
        while (currentExpectedNode.next != null || currentActualNode.next != null) {
            assertEquals(currentExpectedNode.value, currentActualNode.value)
            // next can't be null as asserted in while condition
            currentExpectedNode = currentExpectedNode.next!!
            currentActualNode = currentActualNode.next!!
        }
        // Still need to check the last values
        assertEquals(currentExpectedNode.value, currentActualNode.value)
    }
}