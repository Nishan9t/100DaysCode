// https://leetcode.com/problems/fair-distribution-of-cookies/




class Solution {
    int ans =Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        helper(cookies, 0 ,k,new int[k]);
        return ans;
        
    }
    void helper(int[] cookies , int start, int k , int[] temp)
    {
        if(start == cookies.length)
        {
            int max=0;
            for(int c: temp)
            {
                max= Math.max(max,c);
            }
            ans = Math.min(ans,max);
            return;
        }
        for(int i=0;i<k;i++)
        {
            temp[i] += cookies[start];
            helper(cookies , start +1 , k, temp);
            temp[i] -= cookies[start];
        }
    }
}
