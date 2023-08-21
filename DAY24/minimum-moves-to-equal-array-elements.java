//   https://leetcode.com/problems/minimum-moves-to-equal-array-elements



class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        //finding minimum in nums
        for (int n : nums) {
            min = Math.min(min, n);
        }
        //adding the diff between nums[i]-min to ans
        int ans = 0;
        for (int n : nums) {
            ans += (n - min);
        }
        return ans;
        
    }
}

