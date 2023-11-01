// https://leetcode.com/problems/split-a-string-in-balanced-strings




class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int r=0;
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(r==l && r>0 && l>0)
            {
                count++;
                r=0;
                l=0;
            }
            if(c=='R')
            {
                r++;
            }
            if(c=='L')
            {
                l++;
            }
        }
        //after end of the loop we have to check the value of r and l
        if(r==l && r>0 && l>0)
            {
                count++;

            }
        return count;

    }
}
