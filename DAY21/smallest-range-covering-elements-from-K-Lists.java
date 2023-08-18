//   https://leetcode.com/problems/smallest-range-covering-elements-from-K-Lists

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int max = Integer.MIN_VALUE;
        int k = nums.size();
        int[] res = {-1_00_00_0, 1_00_00_0};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] - b[0]));
        for(int i =0 ; i < k; i++){
            int minElementOfList = nums.get(i).get(0);
            int[] tba = {minElementOfList, 0, i};
            // 0th - minimum element of list
            // 1st - index of element in list
            // 2nd - index of list
            max = Math.max(max, minElementOfList);
            pq.offer(tba);
        }
        while(true){
            int[] min = pq.poll();
            int minElement = min[0];
            int elementIndex = min[1];
            int listIndex = min[2];
            if((res[1] - res[0]) > (max - minElement)){
                res[0] = minElement;
                res[1] = max;
            }
            
            //if any list ends then the loop will end
            if(elementIndex + 1 == nums.get(listIndex).size()){
                break;
            }
            max = Math.max(nums.get(listIndex).get(elementIndex + 1), max);
            //incrementing the index of element which was smallest in PQ and polled out
            int[] tba = {nums.get(listIndex).get(elementIndex + 1), elementIndex + 1, listIndex};
            
            pq.add(tba);
        }
        return res;
    }
}

