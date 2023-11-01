// https://leetcode.com/problems/is-subsequence



class Solution {
    public boolean isSubsequence(String s, String t) {
        int indOfs=0;

        for(int i=0;i<t.length();i++)
        {
            if(indOfs == s.length())
            {
                return true;
            }
            if(s.charAt(indOfs)==t.charAt(i) )
            {
                indOfs++;
            }
        }
        if(indOfs == s.length())
        {
            return true;
        }
        return false;

    }
}