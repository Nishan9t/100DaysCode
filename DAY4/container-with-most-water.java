//   https://leetcode.com/problems/container-with-most-water/





//Two Pointer method

class Solution {
    public int maxArea(int[] height) {
        
        if(height==null|| height.length<2)
        {
            return 0;
        }
        int maxi=0;
        int start=0;
        int end=height.length-1;
        while(start<end)
        {
            int temp=(end-start)*Math.min(height[start],height[end]);
            maxi =Math.max(maxi,temp);
            if(height[start] < height[end])
            {
                start++;
            }
            else{
                end--;
            }
        }
        return maxi;
    }
}
