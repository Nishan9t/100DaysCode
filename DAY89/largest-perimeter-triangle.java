// https://leetcode.com/problems/largest-perimeter-triangle/




class Solution {
    //in triangle => sum of two sides is larger than last side
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=2 ; i--)
        {
            if(nums[i] < nums[i-1]+nums[i-2])
            {
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;

    }
}







