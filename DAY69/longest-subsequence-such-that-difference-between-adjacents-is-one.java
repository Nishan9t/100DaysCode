// https://practice.geeksforgeeks.org/problems/longest-subsequence-such-that-difference-between-adjacents-is-one4724/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions

class Solution{
    static int longestSubsequence(int n, int A[])
    {
        int[] dp= new int[n];
        dp[n-1]=1;
        Arrays.fill(dp,1);
        
        for(int i=n-2;i>=0;i--)
        {
            //check for all value after A[i] with diff 1 with A[i]
            //and get the make dp[i]=with maximum of 1+dp[j]
            for(int j=i+1;j<n;j++)
            {
                
                if(Math.abs(A[i]-A[j])==1)
                {
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
        }
        
        int max=0;
        for(int el:dp)
        {
            if(el>max)
            {
                max=el;
            }
        }
        return max;
    }
}
