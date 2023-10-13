// https://practice.geeksforgeeks.org/problems/divisor-game-1664432414/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Backtracking&sortBy=submissions




class Solution {
  public static boolean divisorGame(int n) {
    
    return solve(0,n);
    
  }
  
  static boolean solve(int x, int n)
  {
     if(n<1)
     {
         return false;
     }
     if(n==1)
     {
         if(x%2 !=0)
         {
             return true;
         }
         else{
             return false;
         }
     }
     
     for(int i=1;i*i<=n;i++)
     {
         if(x%i ==0)
         {
             return solve(x+1 , n-i);
         }
     }
     return false;
  }
}
