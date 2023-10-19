//  https://practice.geeksforgeeks.org/problems/last-non-zero-digit-in-factorial5846/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions




class Solution{
    
    int lastNon0Digit(int N){
       
    long  fact=1,rem;

      long count=0;

      for(int i=1;i<=N;i++)

      {

          fact = fact*i;

          while(fact%10==0)

               fact = fact/10;

               fact%=1000000000;

       }

       return (int)fact%10;
       
    }
    
   
    
}

