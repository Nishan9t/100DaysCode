//   https://leetcode.com/problems/remove-duplicates-from-sorted-list




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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp=head;
        if(head == null)
        {
            return head;
        }
        while(temp.next!=null)
        {
            if(temp.val !=temp.next.val)
            {
                temp =temp.next;
            }
            //if same value occurs then change the next of current with temp.next
            else{
                temp.next = temp.next.next;
            }
        }
        return head;
        
    }
}
