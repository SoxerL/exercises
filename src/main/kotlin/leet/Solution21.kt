package leet

class Solution21 {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }
        val mergedListStart = ListNode(0)
        var tmpMerged = mergedListStart
        var tmpList1 = list1
        var tmpList2 = list2
        while (tmpList1 != null && tmpList2 != null) {
            if (tmpList1.value <= tmpList2.value) {
                tmpMerged.next = tmpList1
                tmpList1 = tmpList1.next
            } else {
                tmpMerged.next = tmpList2
                tmpList2 = tmpList2.next
            }
            tmpMerged = tmpMerged.next!!
        }
        if (tmpList1 == null) {
            tmpMerged.next = tmpList2
        } else {
            tmpMerged.next = tmpList1
        }
        return mergedListStart.next
    }
}