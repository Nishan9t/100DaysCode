// https://leetcode.com/problems/last-stone-weight/



class Solution {
    public int lastStoneWeight(int[] stones) {

        int n=stones.length;

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++)
        {
            heap.add(stones[i]);
        }

        while(heap.size()>1)
        {
            int a =heap.poll();
            int b= heap.poll();
            heap.offer(a-b);
        }
        if(heap.isEmpty())
        {
            return 0;
        }
        else{
            return heap.poll();
        }

        
    }
}