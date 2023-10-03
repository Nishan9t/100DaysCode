// https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions
class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
       long mod = 1000000007;
         if(n==1){
             return 1;
         }
         if(n==2){
             return 2;
         }
         if(n==3){
             return 4;
         }

        long a = 1;
        long b = 2;
        long c = 4;

        long d = 7;
        for (int i = 4; i <n; i++) {

            a = b % mod;
            b = c % mod;
            c = d % mod;

            d = (a % mod + b % mod + c % mod) % mod;

        }
        return d;
    }
    
}
