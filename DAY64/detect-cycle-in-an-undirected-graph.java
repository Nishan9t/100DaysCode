// https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i] && isCycleUtil(adj,vis,i))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean isCycleUtil(ArrayList<ArrayList<Integer>> adj,boolean[] vis , int curr)
    {
        Queue<Integer> q =new LinkedList<>();
        int[] parent = new int[adj.size()];
        Arrays.fill(parent,-1);
        vis[curr] = true;
        q.add(curr);
        
        while(!q.isEmpty())
        {
            int num = q.poll();
            for(int i: adj.get(num))
            {
                if(!vis[i])
                {
                    vis[i]=true;
                    parent[i]=num;
                    q.add(i);
                }
                //whenever parent of a node is more than 1
                //then we can say it is cyclic
                else if(parent[num] !=i)
                {
                    return true;
                }
            }
        }
        return false;
    }
}

