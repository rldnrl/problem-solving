/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        
        while (list.size() > 1) {
            if (!Objects.equals(list.remove(0), list.remove(list.size() - 1))) {
                return false;
            }
        }
        
        return true;
    }
}