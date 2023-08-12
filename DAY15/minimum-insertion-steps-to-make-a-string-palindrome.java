// https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/





class Solution {
    public int minInsertions(String s) {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            s1= s.charAt(i)+s1;
        }
        int lcs= lcs(s1,s,s.length(),s.length());
        return s.length()-lcs;
        
    }
    public int lcs(String str1,String str2, int m,int n)
    {
        int[][] dp=new int[m+1][n+1];
        //first row and column will be 0
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}





