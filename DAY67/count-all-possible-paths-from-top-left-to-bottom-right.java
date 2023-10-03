// https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right3011/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions





class Solution
{
    long numberOfPaths(int m, int n)
    {
       long dp[][] = new long[m][n];
       long mod=1000000007;
       
       //making all celss of first row =1
       for(int i=0;i<n;i++)
       {
           dp[0][i]=1;
       }
       //making all cells of first col =1
       for(int i=0;i<m;i++)
       {
           dp[i][0]=1;
       }
       
       //we can reach any node from its top cell or from its left cell
       //because we can move only down and right
       for(int i=1;i<m;i++)
       {
           for(int j=1;j<n;j++)
           {
               dp[i][j] = (dp[i-1][j]%mod + dp[i][j-1]%mod)%mod;
           }
       }
       return dp[m-1][n-1]%mod;
    }
}
