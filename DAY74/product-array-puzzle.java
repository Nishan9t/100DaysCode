// https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions



class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n)
	{ 
	    long ans[]=new long[n];
	    
        long product=1;
        int zeros =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zeros++;
            }
            else{
                product *=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0 && zeros-1 > 0)
            {
                ans[i]=0;
            }
            else if(arr[i]==0 && zeros-1 ==0)
            {
                ans[i]=product;
            }
            else if(arr[i]!=0 && zeros>0)
            {
                ans[i]=0;
            }
            else if(arr[i]!=0 && zeros ==0)
            {
                ans[i] = product/arr[i];
            }
            else{
                continue;
            }
        }
        return ans;
	} 
} 
