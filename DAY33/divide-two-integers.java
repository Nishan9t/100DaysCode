//   https://leetcode.com/problems/divide-two-integers



class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == Integer.MIN_VALUE)
        {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        if(dividend == Integer.MIN_VALUE)
        {
            if(divisor ==1)
            {
                return dividend;
            }
            else if(divisor == -1)
            {
                //because neg * neg = positive
                return Integer.MAX_VALUE;
            }
        }
        else if(dividend == Integer.MAX_VALUE)
        {
            if(divisor ==1)
            {
                return dividend;
            }
            else if(divisor ==-1)
            {
                //because neg *positive = neg  
                return -dividend;
            }
        }
        // if(dividend ==0)
        // {
        //     return 0;
        // }
        long dividendLong= dividend;
        long divisorLong = divisor;
        boolean sign =false;
        if(dividendLong <0 && divisorLong<0)
        {
            dividendLong = -dividendLong;
            divisorLong = -divisorLong;
        }
        else if(dividendLong < 0 && divisorLong>0)
        {
            sign = true;
            dividendLong = -dividendLong;
        }
        else if(dividendLong > 0 && divisorLong < 0)
        {
            sign =true;
            divisorLong = -divisorLong;
        }
        long ans=0;
        while(dividendLong >=divisorLong)
        {
            dividendLong -= divisorLong;
            ans++;
        }
        ans = sign ? -ans : ans;
        return ans > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) ans;
        
    }
}
