// https://leetcode.com/problems/jump-game-ii/description/


//greedy approach

class Solution {
    public int jump(int[] nums) {
        
        int currReach=0;
        int currMax=0;
        int jumps=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(i+nums[i] >currMax)
            {
                currMax=i+nums[i];
            }
            if(i==currReach)
            {
                jumps++;
                currReach=currMax;
            }
        }
        return jumps;
    }
}

class Solution {
    public int jump(int[] N) {
        
        int len = N.length - 1, curr = -1, next = 0, ans = 0;
        for (int i = 0; next < len; i++) {
            if (i > curr) {
                ans++;
                curr = next;
            };
            next = Math.max(next, N[i] + i);
        };
        return ans;
    }
}

