//   https://leetcode.com/problems/design-hashmap




class Node{
    int key;
    int value;
    Node next;
    public Node(int key,int value)
    {
        this.key = key;
        this.value= value;
        this.next = null;
    }
}


class MyHashMap {
     Node head;
    public MyHashMap() {
       head = null;
        
    }
    
    public void put(int key, int value) {
        Node prev = null;
        Node cur = new Node(key,value);
        
        //if ll is empty
        if(head == null)
        {
            head = cur;
            prev = head;
        }
        //if head contains the key
        else if(head.key == key)
        {
            head.value = value;
        }
        else{
            prev = head;
            while(prev.next !=null)
            {
                if(prev.next.key == key)
                {
                    prev.next.value= value;
                    return;
                }
                prev = prev.next;
            }
            //if the node of given key is not found
            //then add cur node at last of linkedlist
            prev.next =cur;
        }
        return;

        
    }
    
    public int get(int key) {
        Node prev = head;
        while(prev !=null)
        {
            if(prev.key==key)
            {
                return prev.value;
            }
            prev = prev.next;
        }
        return -1;
        
    }
    
    public void remove(int key) {
        //if ll is empty
        if(head ==null)
        {
            return;
        }
        //if head contains the key
        if(head.key ==key)
        {
            head = head.next;
            return;
        }
        Node prev =null; //it will contain previous node to modify its link or next
        Node cur = head;
        while(cur !=null)
        {
            if(cur.key == key)
            {
                prev.next = cur.next;
                return;
            }
            prev=cur;
            cur = cur.next;
        }
        return;
        
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */