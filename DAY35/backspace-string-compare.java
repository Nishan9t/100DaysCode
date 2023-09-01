//   https://leetcode.com/problems/backspace-string-compare



class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st1 = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char charac=s.charAt(i);
            if(Character.isLetter(charac))
            {
                st1.push(charac);
            }
            else if(!Character.isLetter(charac) && !st1.isEmpty()){
                st1.pop();
            }
        }
            Stack<Character> st2 = new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            char charac=t.charAt(i);
            if(Character.isLetter(charac))
            {
                st2.push(charac);
            }
            else if(!Character.isLetter(charac) && !st2.isEmpty()){
                st2.pop();
            }
        }
        if(st1.size() != st2.size())
        {
            return false;
        }
        while(!st1.isEmpty())
        {
            if(st1.pop() != st2.pop())
            {
                return false;
            }
        }
        return true;
        
    }
}



