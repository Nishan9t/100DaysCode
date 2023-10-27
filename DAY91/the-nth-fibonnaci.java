// https://practice.geeksforgeeks.org/problems/the-nth-fibonnaci3150/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Divide%20and%20Conquer&sortBy=submissions



class Solution{
    //after every 60th fibonacci number last digit repeated 
    static int fib(int N){

        int[] fib=new int[61];
        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<=Math.min(60,N);i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
            fib[i]=fib[i]%10;
        }

        return fib[N%60];

    }


}
