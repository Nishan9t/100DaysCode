// https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        int vis[] = new int[V];
        
        for(int i=0;i<V;i++)
        {
            if(vis[i] ==0)
            {
                if(dfsCheck(i,adj,vis) == true)
                {
                    return true;
                }
            }
            
        }
        return false;
    }
    
    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj , int vis[])
    {
        vis[node]=2;
        
        for(int it : adj.get(node))
        {
            if(vis[it] ==0)
            {
                if(dfsCheck(it,adj,vis)==true)
                {
                    return true;
                }
            }
            else if(vis[it] ==2)
            {
                return true;
            }
        }
        vis[node]=1;
        return false;
    }
}
