// https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int dp[][]= new int[n+1][W+1];
         
         for(int i=1;i<dp.length;i++)
         {
             for(int j=1;j<dp[0].length;j++)
             {
                 if(j >= wt[i-1])
                 {
                     int rahee = j-wt[i-1];
                     if(dp[i-1][rahee] + val[i-1] > dp[i-1][j])
                     {
                         dp[i][j]= dp[i-1][rahee] + val[i-1];
                     }
                     else
                     {
                         dp[i][j] = dp[i-1][j];
                     }
                 }
                 else
                 {
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         return dp[n][W];
    } 
}
