// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/



class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        //if count is equal then compare according to a[1] means indexes
        //elese compare according to count of 1s

        //weaker row will be in starting
     PriorityQueue<int[]> pq= new PriorityQueue<>((a, b)-> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);

      for(int i = 0; i < mat.length; i++){
            int count = 0;
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
           pq.offer(new int[]{count, i});
        }

     while(pq.size() > k){
            pq.poll();
        }

      int[] ans = new int[k];
        int j = ans.length - 1;
        while(pq.size() > 0 && j >= 0){
            ans[j] = pq.poll()[1];
            j--;
        }
        
        return ans; 

    }
}