// https://practice.geeksforgeeks.org/problems/reach-the-nth-point5433/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions




class Solution
{
    public int nthPoint(int n)
    {
        int[] dp=new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        //making fibonacci series
        
        for(int i=2;i<=n;i++)
        {
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
            
        }
        return dp[n]%1000000007;
    }
}
