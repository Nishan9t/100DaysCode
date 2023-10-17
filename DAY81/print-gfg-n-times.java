//  https://practice.geeksforgeeks.org/problems/print-gfg-n-times/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions






class Solution {

    void printGfg(int N) {
        if(N==0)
        {
            return;
        }
        System.out.print("GFG"+" ");
        printGfg(N-1);
    }
}


