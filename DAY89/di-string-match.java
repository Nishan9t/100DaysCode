// https://leetcode.com/problems/di-string-match




class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int D=n;
        int I=0;
        int[] ans=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='I')
            {
                ans[i]=I;
                I++;
            }
            else{
                ans[i]=D;
                D--;
            }
        }
        ans[n]=I;
        return ans;

    }

}






