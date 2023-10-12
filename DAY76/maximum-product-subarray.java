// https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        
        long prefix=1;
        long suffix=1;
        
        long maxi = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(prefix ==0)
            {
                prefix=1;
            }
            if(suffix ==0)
            {
                suffix=1;
            }
            
            prefix = prefix * arr[i];
            suffix = suffix * arr[n-i-1];
            
            maxi= Math.max(maxi , Math.max(prefix,suffix));
        }
        return maxi;
    }
}
