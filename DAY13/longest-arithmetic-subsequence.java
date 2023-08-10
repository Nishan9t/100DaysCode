//  https://leetcode.com/problems/longest-arithmetic-subsequence/


class Solution {
    public int longestArithSeqLength(int[] nums) {
        int dp[][]=new int[nums.length][1001];
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                int dif=500+nums[i]-nums[j];
                dp[i][dif]=Math.max(dp[i][dif],dp[j][dif]+1);
                max=Math.max(max,dp[i][dif]);
            }
        }
        return max+1;

        
    }
}
