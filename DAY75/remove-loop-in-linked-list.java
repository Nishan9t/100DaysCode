// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


//TLE

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
       Node slow=head;
       Node fast=head;
       
       while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           //slow==fast means loop exists
           if(slow==fast)
            {
                //detecting loop forming node
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                //tracking previous node of loop forming
                while(fast.next !=slow)
                {
                    fast=fast.next;
                }
                //removing loop
                fast.next=null;
                return;
                
            }
          
       }
       return;
       
       
    }
}
