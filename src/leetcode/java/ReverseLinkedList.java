package leetcode.java;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseListWithIterative(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    public ListNode reverseListWithRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversedSublist = reverseListWithRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return reversedSublist;
    }
}
