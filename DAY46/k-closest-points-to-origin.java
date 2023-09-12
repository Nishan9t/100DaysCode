// https://leetcode.com/problems/k-closest-points-to-origin/


class Solution {
    public int[][] kClosest(int[][] points, int k) {
          //We can completely ignore the square root as we are just comparing the values (if a*a>b*b => a>b)
        /*Integer.compare is used as the comparator function for the PriorityQueue.
           The comparator function is responsible for determining the
          order of elements in the priority queue. In this case, it compares the 
          distances of two points based on the formula (a[0] * a[0] + a[1] * a[1]) and
         (b[0] * b[0] + b[1] * b[1]).*/

         PriorityQueue<int[]> heap = new PriorityQueue<>(
             (a,b) ->
             Integer.compare(
                 (a[0] * a[0] + a[1] * a[1]),
                 (b[0] * b[0] + b[1] * b[1])
                 
             )
         );

         //add arrays into the heap
         for(int[] point:points)
         {
             heap.add(point);
         }

         //ans array
         int[][] ans =new int[k][2];
         //traverse till k
         for(int i=0;i<k;i++)
         {
          int[] cur = heap.poll();
         ans[i][0] = cur[0];
         ans[i][1] = cur[1];
         }

         return ans;
        

    }
}