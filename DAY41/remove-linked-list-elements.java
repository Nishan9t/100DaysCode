//   https://leetcode.com/problems/remove-linked-list-elements/



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
    public ListNode removeElements(ListNode head, int val) {

        //checking if head contains value then changing the head with head.next
        while(head !=null && head.val==val)
        {
            head=head.next;
        }
        //if head is null return head
        if(head == null)
        {
            return head;
        }

        
        ListNode curr=head;
        //if head is not null
        //then checking for curr.next.val==val
        //and changing next of curr node with curr.next.next
        while(curr.next!=null)
        {
            if(curr.next.val==val)
            {
                curr.next=curr.next.next;
                //continue to the loop from same current node 
                //because if next value changes
                //then new next node can also contain same value
                //so that we have to check for same curr node
                continue;
            }
            curr=curr.next;
        }
        return head;


        
    }
}