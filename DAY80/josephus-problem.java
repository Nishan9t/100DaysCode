//  https://practice.geeksforgeeks.org/problems/josephus-problem/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions



class Solution
{
   public int josephus(int n, int k)
    {
        return jos(n,k)+1;
    }
    
    int jos(int n, int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (jos(n-1,k)+k)%n;
    }

}

