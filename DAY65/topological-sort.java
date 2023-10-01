// https://practice.geeksforgeeks.org/problems/topological-sort/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissionsry[]=Graph&sortBy=submissions

class Solution
{
    static int indx;
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean vis[] = new boolean[V];
        
        Stack<Integer> s= new Stack<>();
        indx =0;
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                solve(adj,i,vis,s);
            }
        }
        
        int ans[]= new int[s.size()];
        while(!s.isEmpty())
        {
            ans[indx]=s.pop();
            indx++;
        }
        return ans;
    }
    
    static void solve(ArrayList<ArrayList<Integer>> adj, int curr , boolean[] vis,Stack<Integer>s)
    {
        vis[curr] = true;
        for(int x:adj.get(curr))
        {
            if(!vis[x])
            {
                solve(adj,x,vis,s);
            }
        }
        s.push(curr);
    }
}

