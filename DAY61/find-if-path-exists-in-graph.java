// https://leetcode.com/problems/find-if-path-exists-in-graph



class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
//contains the destination we can reach from node i
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; ++i) 
            graph[i] = new ArrayList<>();
//adding the destinations we can reach from edge[0] and edge[1]
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        
        boolean[] visited = new boolean[n];
        return hasPath(graph, visited, source, destination);
    }
     public boolean hasPath(ArrayList<Integer> []graph, boolean []visited, int src, int dest) {
       if(src == dest) 
         return true;
      visited[src] = true;
        
      for(int nbr : graph[src])
        if(!visited[nbr])
            if(hasPath(graph, visited, nbr, dest))
                return true;
        
      return false;
    }
}

