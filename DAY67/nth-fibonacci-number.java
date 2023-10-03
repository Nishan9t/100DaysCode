// https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions

class Solution {
    static int nthFibonacci(int n){
        if(n<=1)
        {
            return n;
        }
        
        int a=0;
        int b=1;
        
        for(int i=2;i<=n;i++)
        {
            int temp = (a+b)%1000000007;
            a=b;
            b=temp;
        }
        return b;
    }
}


