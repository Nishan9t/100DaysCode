//   https://leetcode.com/problems/max-points-on-a-line/



class Solution {
    public int maxPoints(int[][] points) {
        int pointLen = points.length;
        //if there are 2 or less points that mean we can draw a line throw then
        if(pointLen <=2)
        {
            return pointLen;
        }
        int res=2;
        for(int i=0;i<pointLen;i++)
        {
            Map<Double,Integer> cnt =new HashMap<>();
            for(int j=0;j<points.length;j++)
            {
                if(i!=j)
                {
                    int[] pointI=points[i];
                    int[] pointII=points[j];
                    //we use atan where are range lies from -90 to 90
                    //when we know our range is in -180 to 180 we use atan2
                    Double angle = Math.atan2(pointII[1] - pointI[1] , pointII[0] - pointI[0]);
                    cnt.put(angle,cnt.getOrDefault(angle,0)+1);
                }
            }
            for(Double k: cnt.keySet())
            {
                res=Math.max(res,cnt.get(k)+1);
            }
        }
        return res;
        
    }
}
