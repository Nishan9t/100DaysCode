// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions



class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> list = new ArrayList<>();
        boolean vis[] = new boolean[V+1];
        
        dfsUtil(0, adj, list, vis);
        
        return list;
        
    }
    
    
    public static void dfsUtil(int curr, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list, boolean vis[]) {
        vis[curr] = true;
        list.add(curr);
        
        for(int i=0; i<adj.get(curr).size(); i++) {
            if(!vis[adj.get(curr).get(i)]) {
                dfsUtil(adj.get(curr).get(i), adj, list, vis);
            }
        }
    }
    
}
