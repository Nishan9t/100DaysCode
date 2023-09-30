// https://practice.geeksforgeeks.org/problems/union-find/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions


class Solution
{
    //Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[])
    {
       
        
        int aroot = findRoot(a,par);
        int broot = findRoot(b,par);
        
        if(aroot == broot)
        {
            return;
        }
        
        if(rank[aroot] > rank[broot])
        {
            par[broot] = aroot;
            rank[aroot] += rank[broot];
        }
        else{
            par[aroot] = broot;
            rank[broot] += rank[aroot];
        }
       
    }

    //Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[])
    {
        return findRoot(a,par)==findRoot(b,par);
    }
    
    public int findRoot(int root, int[] par)
    {
        while(root != par[root])
        {
            par[root]= par[par[root]];
            root = par[root];
        }
        return root;
        
    }

}
