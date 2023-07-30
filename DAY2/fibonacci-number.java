// https://leetcode.com/problems/fibonacci-number/


class Solution {
    public int fib(int n) {
        //recursion approach
        // if(n==0)
        // {
        //     return 0;
        // }
        // if(n==1)
        // {
        //     return 1;
        // }
        // else{
        //     return fib(n-1)+fib(n-2);
        // }



//better time complexity
//memorization approach
        if(n<=1){
            return n;
        }
        int[] memo=new int[n+1];
        memo[1]=1;
        for(int i=2;i<n+1;i++)
        {
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
    }
}
