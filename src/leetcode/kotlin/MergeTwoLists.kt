package leetcode.kotlin

class MergeTwoLists {
    fun mergeTwoListsWithIterative(list1: ListNode?, list2: ListNode?): ListNode? {
        val head = ListNode()
        var tail = head

        var currentL1 = list1
        var currentL2 = list2

        while (currentL1 != null && currentL2 != null) {
            if (currentL1.value < currentL2.value) {
                tail.next = currentL1
                currentL1 = currentL1.next
            } else {
                tail.next = currentL2
                currentL2 = currentL2.next
            }

            tail = tail.next!!
        }

        tail.next = currentL1 ?: currentL2

        return head.next
    }

    fun mergeTwoListsWithRecursive(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }


        val head: ListNode
        var currentL1 = list1
        var currentL2 = list2

        if (currentL1.value < currentL2.value) {
            head = currentL1
            currentL1 = currentL1.next
        } else {
            head = currentL2
            currentL2 = currentL2.next
        }

        head.next = mergeTwoListsWithRecursive(currentL1, currentL2)

        return head
    }
}