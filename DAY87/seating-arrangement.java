//  https://practice.geeksforgeeks.org/problems/seating-arrangement--170647/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {

       if(n>m)
       {
           return false;
       }
       if(m==1 && seats[0]==0)
       {
           return true;
       }

       for(int i=0;i<m;i++)
       {
           if(seats[i]==0)
           {
               if((i==0 || seats[i-1]==0) && (i==m-1 || seats[i+1]==0))
               {
                   seats[i]=1;
                   n--;
               }
           }
           if(n==0)
           {
               return true;
           }
       }
       return false;
    }
}




