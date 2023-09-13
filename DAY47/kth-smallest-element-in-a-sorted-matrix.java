// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/


class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //storing all values in ascending order
        for(int i=0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[i].length;j++)
            {
                pq.add(matrix[i][j]);
            }
        }

        //removing the element till k-1
        while(!pq.isEmpty() && k>1)
        {
            pq.poll();
            k--;
        }

        return pq.peek();
        
    }
}