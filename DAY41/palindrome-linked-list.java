//   https://leetcode.com/problems/palindrome-linked-list/


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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int num =0;
        int rev=0;
        int mul=1;
        while(temp !=null)
        {
            num = num *10 + temp.val;
            //making the reverse of value till node
            // mul value adds the 0's after the temp.val to add all the previous rev value at end of current temp.val
            rev = rev + temp.val*mul;
            mul *=10;
            temp =temp.next;
        }
        return num==rev;
        
    }
}