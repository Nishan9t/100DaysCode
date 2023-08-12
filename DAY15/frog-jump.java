//  https://leetcode.com/problems/frog-jump/

class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        //add stones in hashmap
        for(int i=0;i<stones.length;i++)
        {
            map.put(stones[i],new HashSet<>());
        }
        // map.get(stones[0]) => it will give hashset of key =stones[0]i.e. 0;
        map.get(stones[0]).add(1);
        for(int i=0;i<stones.length;i++)
        {
            int currStone= stones[i];
            //hasset in front of current stone to give jumps possible
            HashSet<Integer> jumps= map.get(currStone);
            for(int jump: jumps)
            {
                int position=currStone+jump;
                if(position ==stones[stones.length-1])
                {
                    return true;
                }
                if(map.containsKey(position)==true)
                {
                    if(jump-1 >0)
                    {
                        map.get(position).add(jump-1);
                    }
                    map.get(position).add(jump);
                    map.get(position).add(jump+1);
                }
            }
        }
        return false;
    }

}



