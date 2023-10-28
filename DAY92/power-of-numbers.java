// https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Divide%20and%20Conquer&sortBy=difficulty




class Solution
{
//         The problem can be recursively defined by:

// power(x, n) = power(x, n / 2) * power(x, n / 2);        // if n is even
// power(x, n) = x * power(x, n / 2) * power(x, n / 2);    // if n is odd
     int mod=1000000007;
    long power(int N,int R)
    {
        //Your code here
        if(R==1){return N;}
        if(R==0){return 1;}


        long ans=power(N,R/2)%mod;
        if(R%2==0){
            return (ans*ans)%mod;
        }
        else{
            return (((ans*ans)%mod)*N)%mod;
        }

    }

}
