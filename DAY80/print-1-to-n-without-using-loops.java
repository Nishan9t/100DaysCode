//    https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions


class Solution
{
    
  public void printNos(int N)
    {
        if(N==0)
        {
            return ;
        }
        printNos(N-1);
        System.out.print(N + " ");
        
    }
}
