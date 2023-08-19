//   https://leetcode.com/problems/maximum-product-of-three-numbers


class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
// "case1" represents the product of the two smallest numbers (nums[0] and nums[1]) in the sorted array, multiplied by the largest number (nums[nums.length-1]). You may think why do I use the first two number. Just think, if there are negative numbers and if I multiply two negative numbers then the resultant will be positive.
        int case1= nums[0]*nums[1]*nums[nums.length-1];

        // "case2" represents the product of the three largest numbers in the sorted array (nums[nums.length-1], nums[nums.length-2], and nums[nums.length-3]).
        int case2= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int maxProduct =Integer.max(case1,case2);
        return maxProduct;
        
    }
}
