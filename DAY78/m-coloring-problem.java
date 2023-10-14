// https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Backtracking&sortBy=submissions




class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        
        int color[] = new int[n];
        Arrays.fill(color,0);
        if(fillColorNodes(0,graph,m,n,color))
        {
            return true;
        }
        return false;
    }
    
    public boolean fillColorNodes(int curr , boolean graph[][] , int m,int n,int[] color)
    {
        if(curr ==n)
        {
            return true;
        
        }
        
        for(int i=1;i<=m;i++)
        {
            if(isSafe(graph[curr],i,color))
            {
                color[curr]=i;
                if(fillColorNodes(curr+1,graph,m,n,color))
                {
                    return true;
                }
                color[curr]=0;
            }
        }
        return false;
    }
    
    public boolean isSafe(boolean graph[],int fill,int[] color)
    {
        for(int i=0;i<graph.length;i++)
        {
            if(graph[i]==true && color[i]==fill)
            return false;
        }
        
        return true;
    }
    
}
