//   https://leetcode.com/problems/intersection-of-two-linked-lists/




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //boundary check
        if(headA==null || headB==null)
        {
            return null;
        }

        ListNode a =headA;
        ListNode b =headB;

        //if a & b have different len , then we will stop the loop after second iteration
        while(a!=b)
        {
            //for the end of first iteration , we just reset the pointer to the head of another linkedlist

            //whichever linkedlist will be small,it's variable will change its headnode first
            //and when second linkedlist variable will change its head 
            //both the variable node will be at equal distance from INTERSECTION POINT

            a= a==null? headB : a.next;
            b= b==null? headA : b.next;

        }

        return a;
        
    }
}