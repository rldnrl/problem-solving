/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseListWithIterative = function(head) {
    let prevNode = null
    let currNode = head

    while (currNode !== null) {
        const nextNode = currNode.next
        currNode.next = prevNode
        prevNode = currNode
        currNode = nextNode
    }

    return prevNode
};

var reverseListWithRecursive = function(head) {
    if (head === null || head.next === null) {
        return head
    }

    const reversedSublist = reverseList(head.next)
    head.next.next = head
    head.next = null

    return reversedSublist
};