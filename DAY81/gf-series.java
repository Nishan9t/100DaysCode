//  https://practice.geeksforgeeks.org/problems/gf-series3535/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions



class Solution{
    static void gfSeries(int N){
       
       long first =0;
       long second =1;
       System.out.print(0+" ");
       System.out.print(1+" ");
       recursiveCall(N-2,first,second);
    }
    
    static void recursiveCall(int N,long first,long second)
    {
        if(N==0)
        {
            System.out.println();
            return;
        }
        long third =(first*first)-(second);
        System.out.print(third+" ");
        recursiveCall(N-1,second,third);
    }
}
