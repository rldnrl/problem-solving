/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
var reorderList = function(head) {
    if (head === null) {
        return
    }
    
    let l1 = head // slow
    let l2 = head // fast
    
    while (l2 !== null && l2.next !== null) {
        l1 = l1.next
        l2 = l2.next.next
    }
    
    let reversedLinkedList = null
    let currentNode = l1
    let temp
    
    while (currentNode !== null) {
        temp = currentNode.next
        
        currentNode.next = reversedLinkedList
        reversedLinkedList = currentNode
        currentNode = temp
    }
    
    let first = head
    let second = reversedLinkedList
    
    while (second.next !== null) {
        temp = first.next
        first.next = second
        first = temp
        
        temp = second.next
        second.next = first
        second = temp
    }
};