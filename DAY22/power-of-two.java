//   https://leetcode.com/problems/power-of-two


class Solution {
    public boolean isPowerOfTwo(int n) {
        //remainder-divident method
        if(n==0)
        {
            return false;
        }
        while(n%2==0)
        {
            n=n/2;
        }
        return n==1;
        
    }
}
