//   https://leetcode.com/problems/number-of-provinces



class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] seen =new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(!seen[i])
            {
                dfs(i,isConnected,seen);// Perform DFS traversal to find provinces in the current circle
                cnt++;
            }
        }
        return cnt;
        
    }
    private void dfs(int city,int[][] isConnected,boolean[] seen)
    {
        seen[city]=true; // Mark the current province as visited
        for(int i=0;i<isConnected.length;i++)
        {
             // If the neighbor province is not visited and there is a connection, mark as visited and explore further
            if(isConnected[city][i]==1 && !seen[i])
            {
                dfs(i,isConnected,seen); // Recursive call for unvisited provinces in the current circle
            }
        }
    }
}

