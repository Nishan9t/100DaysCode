// https://leetcode.com/problems/squares-of-a-sorted-array/



class Solution {
    public int[] sortedSquares(int[] nums) {

        //brute force approach


        // for(int i=0;i<nums.length;i++)
        // {
        //     nums[i] *=nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;



        //two pointer method


        int n=nums.length;
        int ans[]=new int[n];
        int i=0;
        int j=n-1;
        for(int p=n-1;p>=0;p--)
        {
            if(Math.abs(nums[i]) > Math.abs(nums[j]))
            {
                ans[p]=nums[i]*nums[i];
                i++;
            }
            else{
                ans[p]=nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
}

