//   https://leetcode.com/problems/minimum-time-to-make-rope-colorful



class Solution {
    public int minCost(String colors, int[] neededTime) {
       
       int time=0;
        for(int i=0;i<colors.length()-1;i++)
        {
            if(colors.charAt(i) == colors.charAt(i+1))
            {
                time +=Math.min(neededTime[i],neededTime[i+1]);
                //if neededtime of i is greater than i+1 then swap the time needed 
                if(neededTime[i] > neededTime[i+1])
                {
                    int temp=neededTime[i];
                    neededTime[i]=neededTime[i+1];
                    neededTime[i+1]=temp;
                }
            }
        }
        return time;
        
    }
}
