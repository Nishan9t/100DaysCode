//  https://leetcode.com/problems/trapping-rain-water/


class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        //filling max left for all right
        int currMax=Integer.MIN_VALUE;
        for(int h=0;h<n;h++)
        {
            if(height[h]>currMax)
            {
                currMax=height[h];
            }
            left[h]=currMax;
        }
        currMax=Integer.MIN_VALUE;
        for(int h=n-1;h>=0;h--)
        {
             if(height[h]>currMax)
            {
                currMax=height[h];
            }
            right[h]=currMax;
        }
        int total=0;
        for(int i=0;i<n;i++)
        {
            int capacity= Math.min(left[i],right[i]);
            total+=capacity-height[i];
        }
        return total;
        
    }
}

