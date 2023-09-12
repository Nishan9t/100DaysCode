// https://leetcode.com/problems/furthest-building-you-can-reach/


class Solution {
    // Ideally we have to use top 'ladders' positive differences in building heighs using ladders and rest using bricks. So we have to maintain a min heap which keeps track positive differences, only the top 'ladders' greatest differences will be used by ladders..
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        //min heap

        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i=1;i<heights.length;i++)
        {
            int diff = heights[i]-heights[i-1];
            //if current building is bigger than previous building
            if(diff > 0)
            {
                p.add(diff);
            }
            if(p.size() > ladders)
            {
                
                bricks -= p.poll();
            }
            
            //which means we can use ladder and bricks only is the previous building not for current building so return i-1
            if(bricks <0)
            {
                return i-1;
            }


        }
        if(bricks >=0)
        {
            return heights.length-1;
        }
        return -1;
        
    }
}