// https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions



class Solution {
    int findMaxSum(int arr[], int n) {
        if(n==1)
        {
            return arr[0];
        }
        if(n==2)
        {
            return Math.max(arr[0],arr[1]);
        }
       
       int dp[]=new int[n];
       
       dp[0]=arr[0];
       dp[1]=arr[1];
       dp[2]=arr[0]+arr[2];
       
       for(int i=3;i<n;i++)
       {
           //we can choose between (i-2)th or (i-3)th value
           dp[i]=Math.max(dp[i-2],dp[i-3])+arr[i];
       }
       
       return Math.max(dp[n-1],dp[n-2]);
       
    }
}
