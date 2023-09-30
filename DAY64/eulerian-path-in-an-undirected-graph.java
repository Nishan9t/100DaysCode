// https://practice.geeksforgeeks.org/problems/eulerian-path-in-an-undirected-graph5052/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions


class Solution{
    static int eulerPath(int N, int graph[][]){
        //eularian path is a path which visit every edge of graph
        //eularian path is exist if there is 0 or 2 vertice having odd degree(odd numbers of neighbours)
        
        int oddVertices =0;
        for(int i=0;i<graph.length;i++)
        {
            int nbrs = 0;
            for(int j=0;j<graph[i].length;j++)
            {
                //these loop for neighbours
                if(graph[i][j] ==1)
                {
                    //i is connected to j
                    nbrs++;
                }
            }
            if(nbrs %2 !=0)
            {
                //odd degree
                oddVertices++;
            }
        }
         //if there is 0 or 2 vertices having odd degree then eularian path will exist
        if(oddVertices==0 || oddVertices==2){
            return 1;
        }
        return 0;
    }
}
