// https://leetcode.com/problems/valid-parentheses



class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(st.isEmpty())
            {
                st.push(c);
            }
            else{
                char top=st.peek();
                if((top=='(' && c==')') || (top=='{' && c=='}') || (top=='[' && c==']') )
                {
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }
}