// https://practice.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string4111/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions


//Kadane's algo
class Solution {
    int maxSubstring(String S) {
        
        int n=S.length();
        int maxi = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(S.charAt(i)=='0')
            {
                sum+=1;
            }
            if(S.charAt(i)=='1')
            {
                sum-=1;
            }
            if(sum>maxi)
            {
                maxi=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
            
        }
        return maxi;
        
    }
}
