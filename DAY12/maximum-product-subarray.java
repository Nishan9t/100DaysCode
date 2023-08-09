//  https://leetcode.com/problems/maximum-product-subarray/


class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int maxSoFar = ans, minSoFar = ans;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            maxSoFar = Math.max(maxSoFar*nums[i],nums[i]);
            minSoFar = Math.min(minSoFar*nums[i],nums[i]);
            ans = Math.max(maxSoFar,ans);
        }
        return ans;
    }
}
