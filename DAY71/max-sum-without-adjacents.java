// https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents--170645/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions




class Solution {
    int findMaxSum(int arr[], int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return arr[0];
        }
        if(n==2)
        {
            return Math.max(arr[0],arr[1]);
        }
//arr to contain max sum till this point from back
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        
       dp[n-1]=arr[n-1];
       dp[n]=0;
       for(int i=n-2 ; i>=0;i--)
       {
           dp[i]= Math.max(arr[i]+dp[i+2],dp[i+1]);
       }
       return dp[0];
    }
}
