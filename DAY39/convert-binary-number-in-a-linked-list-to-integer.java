//   https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer

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
    public int getDecimalValue(ListNode head) {
       int len=0;
       int sum=0;
       ListNode curr =head;
       while(curr!=null)
       {
           len++;
           curr = curr.next;
       }
       len--;
       curr=head;
                //1 0 1
        //len=>   2 1 0
        //sum=>   2+0+1=5
       while(curr!=null)
       {
           //getting sum just like basic method of power of len with val and adding them
           sum += curr.val * Math.pow(2,len--);
           curr=curr.next;
       }
       return sum;
        
    }
}

