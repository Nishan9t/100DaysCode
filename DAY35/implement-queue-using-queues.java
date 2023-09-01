//   https://leetcode.com/problems/implement-stack-using-queues




class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue=new LinkedList<>();
        
    }
    
    public void push(int x) {
        queue.add(x);
        //running loop less than queue.size()-1 so that last element of queue should be at start
        for(int i=1;i<queue.size();i++)
        {
            //putting first emelemt of queue at end of queue and removing the element from start
            queue.add(queue.peek());
            queue.remove();
        }
        
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
        
    }
    
    public boolean empty() {
        return queue.isEmpty();
        
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

