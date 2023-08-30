//   https://leetcode.com/problems/find-peak-element



class Solution {
    //takeUforward
    public int findPeakElement(int[] nums) {
      int n=nums.length;
      if(n==1) return 0;
      //checking for first element
      if(nums[0]>nums[1]) return 0;
      //checking for last element
      if(nums[n-1]>nums[n-2]) return n-1;
      int start=1,end=n-2,mid=0;
      while(start<=end)
      {
          mid=(start+end)/2;
          if(nums[mid]>nums[mid-1]  && nums[mid]>nums[mid+1]) return mid;
          if(nums[mid]>nums[mid+1])
          {
              end=mid-1;
          }
          else{
              start =mid+1;
          }
      }
      return -1;
       
        
    }
}
