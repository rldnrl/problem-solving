package leetcode.kotlin

class LinkNode(val value: Int) {
    var next: LinkNode? = null
}

class ReverseLinkedList {
    fun reverseLinkedListWithIterative(head: LinkNode?): LinkNode? {
        var prevNode: LinkNode? = null
        var currNode: LinkNode? = head

        while (currNode != null) {
            val nextNode = currNode.next
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
        }

        return prevNode
    }
}