// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/




class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum =0;
//Check if first element of the array is positive.
// i. If K is even, don't modify anything.
// ii. Else, modify the lowest element.
        if(nums[0] >=0 && k%2 !=0)
        {
            nums[0] = -nums[0];
        }
//         Else, mark all -ve elements positive for a given K.
// If K after operations is not even then, mark the lowest element -ve.
// Sum up and return.
        else if(nums[0] <0)
        {
            int change =0;
            while(k>0 && change < nums.length && nums[change]<0)
            {
                nums[change] = -nums[change++];
                k--;
            }
            if(k%2 !=0)
            {
                int index =change < nums.length && nums[change] < nums[change-1] ? change : change-1;
                nums[index] = -nums[index];
            }
        }
        for(int val : nums)
        {
            sum += val;
        }
        return sum;

    }
}







