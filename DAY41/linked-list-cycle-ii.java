//   https://leetcode.com/problems/linked-list-cycle-ii




/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//  When the two pointers meet, we know that there is a cycle in the linked list.
// We then reset the slow pointer to the head of the linked list and move both pointers at the same pace, one step at a time, until they meet again.
// The node where they meet is the starting point of the cycle.
// If there is no cycle in the linked list, the algorithm will return null.
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}

