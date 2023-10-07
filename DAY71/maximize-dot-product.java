// https://practice.geeksforgeeks.org/problems/maximize-dot-product2649/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions




class Solution
{
	public int maxDotProduct(int n, int m, int A[], int B[]) 
	{ 
		int dp[][]= new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
		    for(int j=0;j<=m;j++)
		    {
		        if(i==0||j==0)
		        {
		            dp[i][j]=0;
		        }
		        else if(i==j)
		        {
		            dp[i][j]=A[i-1]*B[j-1] + dp[i-1][j-1];
		        }
		        else if(i>j)
		        {
		            dp[i][j]= Math.max(A[i-1]*B[j-1] + dp[i-1][j-1] , dp[i-1][j]);
		        }
		    }
		}
		return dp[n][m];
	} 
}