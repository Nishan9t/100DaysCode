// https://leetcode.com/problems/length-of-last-word/


class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int len=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                len++;
            }
            else{
                 break;
            }
        }
        return len;

    }
}

