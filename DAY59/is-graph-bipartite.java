// https://leetcode.com/problems/is-graph-bipartite




class Solution {
// 1)here i have explain questions:=
// A Bipartite graph is a graph whose virtices can divided in to two independent sets,U nad V such that every edge(u,v) either connects a vertex from u to v or a vertex from v to u . In other words for every edge(u,v) either U belongs to U and v to V or u belongs to U we csn also say that there is no edge that connects vertices of same set.
// Check:-
// neighbour->col->Same then return false;
// neighbour->col->diff->continue;
// 3)neighbour->col->opposite+push in Queue
   

    public boolean isBipartite(int[][] graph) {
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;//No color
        }
        Queue<Integer> qe=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
           if(col[i]==-1){//BFS
               qe.add(i);
               col[i]=1;//yellow
               while(!qe.isEmpty()){
                   int curr=qe.poll();
                   int arr[]=graph[curr];
                   for(int j=0;j<arr.length;j++){
                       if(col[graph[curr][j]]==-1){
                         
                           col[graph[curr][j]]=1-col[curr];
                           qe.add(graph[curr][j]);
                       }
                       else if(col[graph[curr][j]]==col[curr]){
                           return false;
                       }
                   }
               }
           }
        }
        return true;
    }
}

