// https://practice.geeksforgeeks.org/problems/transitive-closure-of-a-graph0930/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions


//understand it by making directed graph
class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
    {
        boolean visited[]=new boolean[N]; 
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>(); 
        for(int i=0;i<N;i++)
        {
            arr.add(new ArrayList<>()); //add one by one
        }
        //row
        for(int i=0;i<N;i++)
        {
             Arrays.fill(visited,false);  //assigns flase to all elements of visited array
            //dfs for which node are reachable from node i
            dfs(graph,i,visited);
            
            //col
            for(int j=0;j<N;j++)
            {
               
                if(visited[j] == true)
                {
                    arr.get(i).add(j,1);
                }
                else{
                    arr.get(i).add(j,0);
                }
            }
            
        }
        
        return arr;
        
    }
    
   public static void dfs(int[][] graph,int s, boolean visited[])
    {
        //every node is reachable from itself
        visited[s] = true;
        
        for(int i=0;i<graph.length ; i++)
        {
            if(graph[s][i] == 1)
            {
                if(visited[i] == false)
                {
                    dfs(graph , i, visited);
                }
            }
        }
    }
    
    
}
