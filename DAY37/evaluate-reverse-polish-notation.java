//   https://leetcode.com/problems/evaluate-reverse-polish-notation




class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s: tokens)
        {
            if(s.equals("+")|| s.equals("-")|| s.equals("/")|| s.equals("*")){
                int b=st.pop();
                int a=st.pop();
                int res = cal(a,b,s.charAt(0));
                st.push(res);
            }
            else{
                //pushing integer value
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
        
    }
    private int cal(int a, int b, char oprtr)
    {
        if(oprtr=='+')
        {
            return a+b;
        }
         else if(oprtr=='-')
        {
            return a-b;
        }
        else if(oprtr=='*')
        {
            return a*b;
        } 
        else
        {
            return a/b;
        }
    }
} 

