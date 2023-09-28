// https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1?page=1&difficulty[]=-2&category[]=Graph&sortBy=submissions



class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
       Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int n = q.poll();
            ans.add(n);
            for(int i=0;i<adj.get(n).size();i++){
                int val = adj.get(n).get(i);
                if(!ans.contains(val) && visited[val]!=true){
                    q.add(val);
                    visited[val] = true;
                }
            }
        }
        
        return ans;
    }
}



