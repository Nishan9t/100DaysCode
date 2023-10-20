//  https://practice.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions



class Solution {

    long[] Series(int N) {
        long[] fib=new long[N+1];
        
        if(N==0)
        {       
            return new long[]{0};
        }
        if(N==1)
        {
            return new long[]{0,1};
        }
        
        fib[0]=0;
        fib[1]=1;
        
        series(2,fib,N);
        return fib;
    }
    
    static void series(int i,long[] fib, int n)
    {
        if(i==n)
        {
            fib[i]=fib[i-1]+fib[i-2];
            return;
        }
        fib[i]=fib[i-1]+fib[i-2];
        series(i+1,fib,n);
        
        
    }
}