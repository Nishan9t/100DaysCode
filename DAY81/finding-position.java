//  https://practice.geeksforgeeks.org/problems/finding-position2223/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions





class Solution {
    static long nthPosition(long n){
        
        if(n==1)
        {
            return 1;
        }
        return 2*nthPosition(n/2);
    }
}

