// https://leetcode.com/problems/minimum-number-of-refueling-stops


class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int res =0;
        int curDist = startFuel;
//  Stations can be saved in priority queue ordered by station fuel, on each step we fill up the queue with all stations reachable from out current point.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> stations[b][1] - stations[a][1]);
        int i=0;
        while(curDist < target)
        {
            //adding stations whose postion <= curdistance i can travel
            while(i<stations.length && stations[i][0] <= curDist)
            {
                pq.add(i++);
            }
            if(pq.isEmpty())
            {
                return -1;
            }
            //adding distance(fuel) we got from station in curdist
            curDist += stations[pq.poll()][1];
            //increment the no. of stations needed
            ++res;
        }
        return res;
        
    }
}

