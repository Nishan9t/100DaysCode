//   https://leetcode.com/problems/non-overlapping-intervals



class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //sorting on ending
        Arrays.sort(intervals,(a,b)->(a[1]-b[1]));
        int ans=0;
        int endTime=-60000;
        for(int i=0;i<intervals.length;i++)
        {

  //checking with start element of every interval with endtime of previous interval

            if(intervals[i][0]<endTime)
            {
                ans++;
            }
            else{
                endTime=intervals[i][1];
            }
        }
        return ans;
        
    }
}
