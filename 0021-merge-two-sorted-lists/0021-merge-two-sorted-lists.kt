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
        val head = ListNode()
        var tail = head
        
        var currentL1 = list1
        var currentL2 = list2
        
        while (currentL1 != null && currentL2 != null) {
            if (currentL1.`val` < currentL2.`val`) {
                tail.next = currentL1
                currentL1 = currentL1.next
            } else {
                tail.next = currentL2
                currentL2 = currentL2.next
            }
            tail = tail.next
        }
        
        tail.next = if (currentL1 == null) currentL2 else currentL1
        
        return head.next
    }
}