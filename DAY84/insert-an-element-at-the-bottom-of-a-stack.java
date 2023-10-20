//  https://practice.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions



class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
        
        pushinlast(St,X,St.size());
        return St;
        
    }
    
    static void pushinlast(Stack<Integer> St,int X,int size)
    {
        if(size==0)
        {
            St.push(X);
            return;
        }
        
        int n=St.pop();
        pushinlast(St,X,size-1);
        St.push(n);
    }
}
