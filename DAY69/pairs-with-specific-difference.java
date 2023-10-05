// https://practice.geeksforgeeks.org/problems/pairs-with-specific-difference1533/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions

class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        Arrays.sort(arr);
        
        int dp[] = new int[N];
        
        Arrays.fill(dp,-1);
        
        int ans =0;
        //from last index of dp
        for(int i=N-1;i>=0;i--)
        {
            //if arr[i] is not used
            if(dp[i]==-1)
            {
                //from curr-1 to 0th index of arr
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[i]-arr[j] <K)
                    {
                        //if arr[j] is not used
                        if(dp[j]==-1)
                        {
                            ans+=arr[i]+arr[j];
                            dp[j]=arr[i]+arr[j];
                            break;
                        }
                    }
                }
            }
        }
        
        return ans;
    }
    
}
