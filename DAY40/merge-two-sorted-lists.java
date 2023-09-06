//   https://leetcode.com/problems/merge-two-sorted-lists



//RECURSIVE

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1 == null)
        {
            return list2;
        }
        return list1;
        
    }
}



//ITERATIVE


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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //creating new ll to store the answer list
      ListNode prehead = new ListNode(-1);
      ListNode cur = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        
        return prehead.next;//becuase prehead first node contains -1
        
    }
}

