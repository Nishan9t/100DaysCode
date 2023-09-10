//  https://leetcode.com/problems/max-consecutive-ones-iii/





class Solution {
    public int longestOnes(int[] nums, int k) {

        int n=nums.length;
        int left=0;
        int right=0;
        int len=0;
        int counter=0;

        while(right<n)
        {
            if(nums[right]==0)
            {
                counter +=1;
            }
            //if number of zeros becomes greater than k
            //then we will start to move left by 1
            //till we got nums[left]==0 
            //so that we can decrease the counter by 1 because we will make left +=1
            //which means we passed that 0 and now,it will not consider in our length
            while(counter>k)
            {
                if(right-left >len)
                {
                    len = right-left;
                }
                if(nums[left]==0)
                {
                    counter -=1;
                }
                left +=1;
            }
            right +=1;

           
        }
         len=Math.max(len,right-left);
        return len;
        
    }
}