/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }


        val head: ListNode
        var currentL1 = list1
        var currentL2 = list2

        if (currentL1.`val` < currentL2.`val`) {
            head = currentL1
            currentL1 = currentL1.next
        } else {
            head = currentL2
            currentL2 = currentL2.next
        }

        head.next = mergeTwoLists(currentL1, currentL2)

        return head
    }
}