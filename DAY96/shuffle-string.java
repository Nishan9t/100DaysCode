// https://leetcode.com/problems/shuffle-string




class Solution {
    public String restoreString(String s, int[] indices) {
        char[] shuffled=new char[indices.length];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            shuffled[indices[i]]=c;
        }
        String ans = new String(shuffled);
        return ans;

    }
}
