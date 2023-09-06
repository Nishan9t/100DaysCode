//   https://leetcode.com/problems/linked-list-cycle




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
public class Solution {
    public boolean hasCycle(ListNode head) {
        //jump from current to next node
        ListNode slow = head;
        //just from current node to current.next.next;i.e two nodes
        ListNode fast = head;
        while(fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
        
    }
}
