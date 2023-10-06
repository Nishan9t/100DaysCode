// https://practice.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions




class Geeks {
    public long count(int n) {
        long[] dp = new long[(int)n+1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        
      
        //index we can reach using only 3
        for(int i=3;i<=n;i++)
        {
            dp[i]+=dp[i-3];
        }
        //index we can reach using 3 and 5
        for(int i=5;i<=n;i++)
        {
            dp[i]+=dp[i-5];
        }
        //index we can reach using 3 and 5 and 10
        for(int i=10;i<=n;i++)
        {
            dp[i]+=dp[i-10];
        }
        
        
        return dp[n];
    }
}
