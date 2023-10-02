// https://practice.geeksforgeeks.org/problems/number-of-provinces/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions



class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        
        int visited[] = new int[V];
        int ans =0;
        
        for(int i=0 ;i<V;i++)
        {
            if(visited[i] !=1)
            {
                dfs(adj,visited,i,V);
                ans++;
            }
        }
        return ans;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int[] visited,int indx,int V)
    {
        visited[indx]=1;
        
        for(int i=0;i<V;i++){
            if(i==indx)
            {
                continue;
            }
            if(visited[i]!=1 && adj.get(indx).get(i)==1)
            {
                dfs(adj,visited,i,V);
            }
        }
    }
};



