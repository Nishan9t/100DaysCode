// https://leetcode.com/problems/sort-colors/



class Solution {
    public void sortColors(int[] nums) {
        int low=0,cur=0,high=nums.length-1;
        int temp;
        while(cur<=high)
        {
            switch(nums[cur])
            {
                //only change the low value which takes the index for 0
                case 0:{
                    temp=nums[low];
                    nums[low]=nums[cur];
                    nums[cur]=temp;
                    cur++;
                    low++;
                    break;
                }
                case 1:{
                    cur++;
                    break;
                }
                //last high represents the 2 and runs from last index of nums
                case 2:{
                    temp = nums[cur];
                    nums[cur]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                }
            }
        }
        
    }
}


