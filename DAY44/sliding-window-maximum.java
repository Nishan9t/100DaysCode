//  https://leetcode.com/problems/sliding-window-maximum/





class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        //taking indexs and extracting maximum value
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
           return nums[b]-nums[a];
       }); 

       int n=nums.length;
       //For a array of length n we will be having n-k+1 total windows.
       int ans[] = new int[n-k+1];
       int idx =0;
       for(int i=0;i<n;i++)
       {
           //removing the elements till current maximum is out of sliding window
           //i-k represents the starting index of sliding window
           while(pq.size()>0 && pq.peek()<=i-k)
           {
               pq.remove();
           }
           //adding index in pq
           pq.add(i);
           //when index becomes greater than k-1 then we have to get and store the maximum value in ans array
           if(i>=k-1)
           {
               ans[idx++]=nums[pq.peek()];
           }
       }
       return ans;
        
    }
}