//   https://leetcode.com/problems/reverse-linked-list



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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current =head;
        //in first loop it will assign null to head.next
        //beacuse it will be last node
        while(current !=null)
        {
           
            ListNode temp =current.next;
            //linking current node with previous node by changing current.next
            current.next = prev;
            prev = current;
            current =temp;
        }
        return prev;
    }
}