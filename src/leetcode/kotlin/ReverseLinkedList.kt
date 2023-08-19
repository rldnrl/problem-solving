package leetcode.kotlin

class ListNode(val value: Int) {
    var next: ListNode? = null
}

class ReverseLinkedList {
    fun reverseLinkedListWithIterative(head: ListNode?): ListNode? {
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

    fun reverseLinkedListWithRecursive(head: ListNode?): ListNode? {
        if (head == null || head?.next == null) {
            return head
        }

        val reversedSublist: ListNode? = reverseLinkedListWithRecursive(head.next)
        head.next!!.next = head
        head.next = null

        return reversedSublist
    }
}