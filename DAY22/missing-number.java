//   https://leetcode.com/problems/missing-number


class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        //important 
        // for n=3
        // we need 0,1,2,3 => sum=6
        // if we miss 2 then sum will ne 6-2=4
        int sum =n*(n+1)/2;
        for(int i:nums)
        {
            sum -=i;
        }
        return sum;
        
    }
}
