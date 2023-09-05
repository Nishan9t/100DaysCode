//   https://leetcode.com/problems/middle-of-the-linked-list


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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next==null)
        {
            return head;
        }
        int size=0;
        
        ListNode temp=head;
        //counting size of linkedlist
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        //getting middle of ll
        int middle=size/2;
        int i=0;
        ListNode prev=head;
        while(i<middle)
        {
            prev=prev.next;
            i++;
        }
        return prev;
    }
}
