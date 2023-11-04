// https://leetcode.com/problems/set-mismatch



class Solution {
    public int[] findErrorNums(int[] nums) {
       int dup=0;
       int lost=0;
       int xor=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++)
       {
           if(i+1 < nums.length && nums[i]==nums[i+1])
           {
               dup = nums[i];
           }
            //in last xor will contain the value of xor which we will get after the dup value
           xor = (xor ^ nums[i])^(i+1);
       }
    //we xor it again with dup value so that we can get i+1 or lost
       lost = (xor ^ dup);
       return new int[]{dup,lost};

    }
}






