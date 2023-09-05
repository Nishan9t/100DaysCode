//   https://leetcode.com/problems/delete-node-in-a-linked-list



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // You are given the node to be deleted node
    //that means we have to just replaced the value of current node(that should be deleted) with the next node 
    //and also replaced the link of current node with address of next node of next node
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next = node.next.next;
        
    }
}

