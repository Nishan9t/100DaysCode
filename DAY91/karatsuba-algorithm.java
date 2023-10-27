// https://practice.geeksforgeeks.org/problems/karatsuba-algorithm0135/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Divide%20and%20Conquer&sortBy=submissions



class Solution {
    static Long karatsubaAlgo(String A, String B) {

       long a = Long.parseLong(A,2);
       long b = Long.parseLong(B,2);

       long ans = a*b;
       return ans;
    }
};
