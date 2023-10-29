// https://leetcode.com/problems/wiggle-sort-ii/


class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int j=arr.length-1;
        //for odd places
        for(int i=1;i<nums.length;i+=2)
        {
            nums[i]=arr[j];
            j--;
        }
        //for even places
        for(int i=0;i<nums.length;i+=2)
        {
            nums[i]=arr[j];
            j--;
        }

    }
}