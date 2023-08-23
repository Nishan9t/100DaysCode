//   https://leetcode.com/problems/gas-station



class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total =0;
        int avail=0;
        int index=0;
        for(int i=0;i<gas.length;i++)
        {
//total shows the paid+used gas if total<0 means we paid more than gas used hence return -1
            total +=gas[i]-cost[i];
            avail +=gas[i]-cost[i];
            if(avail <0)
            {
                avail =0;
                index =i+1;
            }
        }
//paid greater than we gas used
        if(total <0)
        {
            return -1;
        }
        return index;
        
    }
}
