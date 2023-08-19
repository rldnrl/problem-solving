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
    fun reverseList(head: ListNode?): ListNode? {
        var prevNode: ListNode? = null
        var currNode: ListNode? = head
        
        while (currNode != null) {
            val nextNode = currNode.next
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
        }
        
        return prevNode
    }
}