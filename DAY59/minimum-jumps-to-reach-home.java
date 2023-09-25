// https://leetcode.com/problems/minimum-jumps-to-reach-home



class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int maxNumPossible = 2000 + 2 * b;
        
        boolean[][] visited = new boolean[maxNumPossible][2];
        boolean[] notAllowed = new boolean[maxNumPossible];
        
        for (int forbid : forbidden) notAllowed[forbid] = true;
        
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{0, 0});
        // [0] = position of jump
        // [1] = direction of jump
        int jumps = 0;
        
        while (!q.isEmpty()) {
            
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int pos = current[0];
                int dir = current[1];
                if (pos == x) return jumps;
                
                if (pos + a < maxNumPossible &&
                    !visited[pos+a][0] &&
                    !notAllowed[pos+a]) {
                    q.offer(new int[]{pos+a, 0});
                    visited[pos][0] = true;
                    
                }
                
                if (dir == 0 &&
                   pos - b >= 0 &&
                   !visited[pos-b][1] &&
                    !notAllowed[pos-b]) {
                    
                    q.offer(new int[]{pos-b, 1});
                    visited[pos-b][1] = true;
                }
                
                
            }
            
            jumps++;
        }
        
        return -1;
    }
}


