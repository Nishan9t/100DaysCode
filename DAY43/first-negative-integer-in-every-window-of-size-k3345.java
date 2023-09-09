//   https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1





class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        
        long[] ans = new long[N-K+1];
        int idx=0;
        
        int left = 0;
        int right =left+K-1;
        
        while(right <N)
        {
            int count=0;
            for(int i=left;i<=right;i++)
            {
                if(A[i]<0)
                {
                    ans[idx++]=A[i];
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                ans[idx++]=0;
            }
            left++;
            right++;
        }
        return ans;
        
    }
}




