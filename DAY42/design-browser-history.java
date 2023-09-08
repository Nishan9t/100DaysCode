//   https://leetcode.com/problems/design-browser-history


class BrowserHistory {
    //creating the structure for doubly linkedlist
    class Node{
        String val;
        Node prev;
        Node next;
        public Node(String val)
        {
            this.val=val;
        }
    }
    //the node which will be used to traverse
    Node curr;
    public BrowserHistory(String homepage) {
        //making the first node using homepage
        Node node = new Node(homepage);
        node.prev=null;
        node.next=null;
        curr = node;
        
    }
    
// simple explanation of visit is that the new node to be visited from the curr is attched just to the next to it, 
// even if the url is already present in the linked still we need to create a new node of url and attach it next to curr,
// imp-> if any other chain of nodes are present ahead of curr, they are removed and the new url node is added 
    public void visit(String url) {
        Node node= new Node(url);
        curr.next = node;
        Node temp = curr;
        //making new node as current node 
        curr = curr.next;
        //making current.prev = previous node
        curr.prev = temp;
        
    }
    // go back and get the value , if we exceed the linked list then return the first value   
    public String back(int steps) {
        while(curr.prev !=null && steps-- >0)
        {
            curr = curr.prev;
        }
        return curr.val;
        
    }
    //same as back
    
    public String forward(int steps) {
        while(curr.next!=null && steps-- >0)
        {
            curr = curr.next;
        }
        
        return curr.val;
    }
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */


