// https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
       
       int[] dist = new int[adj.size()];
       
       Arrays.fill(dist , Integer.MAX_VALUE);
       boolean[] fin = new boolean[adj.size()];
       
       dist[S]=0;

//in each iteration we will select the node nearest to current source(parent) node and update the value of dist[]
       for(int i=0;i<V-1;i++)
       {
           int source = -1;
           for(int j=0;j<V;j++)
           {
               if(fin[j]== false && (source ==-1 || dist[j] < dist[source]))
               {
                   source=j;
               }
           }
           fin[source] =true;
           for(int j=0;j<adj.get(source).size();j++)
           {
               int node = adj.get(source).get(j).get(0);
               int weight = adj.get(source).get(j).get(1);
               
               if(fin[node] == false)
               {
                  dist[node]=Math.min(dist[node],dist[source]+weight); 
               }
           }
       }
       
       return dist;
       
       
    }
}


