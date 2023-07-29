// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
      
        int j=0; 
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i]; // replacing non-zero element
                j++; //counting number of non -zero digits replaced
            }

        }
        //appending 0 on the indexes where nums[] is black at end
        for(int k=j;k<nums.length;k++)
        {
            nums[k]=0;
        }
    }
}
