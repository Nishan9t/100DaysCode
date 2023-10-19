//  https://practice.geeksforgeeks.org/problems/recursive-sequence1611/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions




class Solution{
    static long sequence(int n){
        
        
        long prod =1;
        if(n==1)
        {
            return prod;
        }
        
//s gives the number from which we have to start multiplication
//like for n=5 => we have to start multiplication from 11

        long s =(n*(n-1))/2;
        
        for(long i=s+1;i<=s+n;i++)
        {
            prod = prod*i;
        }
        
        return sequence(n-1)+prod;
    }
}