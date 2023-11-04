// https://leetcode.com/problems/binary-number-with-alternating-bits/



class Solution {
    public boolean hasAlternatingBits(int n) {

       while(n != 0)
       {
           int a = (n&1);
           n = n>>1;
           int b=(n&1);
           if(a==b)
           {
               return false;
           }
       }
       return true;
    }
}







