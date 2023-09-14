// https://leetcode.com/problems/merge-k-sorted-lists


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
    public ListNode mergeKLists(ListNode[] lists) {
        //sorting the lists using min-heap 
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for (ListNode list: lists) {
            if (list == null) {
                continue;
            }
            pq.add(list);
        }
        ListNode ans = new ListNode(0);
        ListNode dummy= ans;
        //adding all the sorted data in linkedlist
        while(!pq.isEmpty())
        {
            ListNode curr = pq.poll();
            dummy.next =curr;
            if(curr.next !=null)
            {
                pq.add(curr.next);
            }
            dummy =dummy.next;
        }
        return ans.next;



        
        
    }
}

