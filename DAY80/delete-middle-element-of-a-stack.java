//   https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions



class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
       
       delete(s,sizeOfStack,1);
    } 
    
    //first popping the element
    //then go next element
    //till all element get popped
    //after than come bach with pushing them if the element is not mid of stack
    public void delete(Stack<Integer>s, int sizeOfStack,int idx)
    {
        if(idx==sizeOfStack)
        {
            return;
        }
        
        int temp = s.pop();
        delete(s,sizeOfStack,idx+1);
        if(idx==sizeOfStack/2+1)
        {
            return;
        }
        else{
            s.push(temp);
        }
    }
}
