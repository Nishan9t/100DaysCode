// https://practice.geeksforgeeks.org/problems/hamiltonian-path2522/1?page=2&difficulty[]=1&category[]=Graph&sortBy=submissions


class Solution 
{ 
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
       ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
       
       for(int i=0;i<=N;i++)
       {
           graph.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> list : Edges)
        {
            int u= list.get(0);
            int v= list.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
            
        }
        
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<N;i++)
        {
            if(ispresent(stack,graph,N,i))
            {
                return true;
            }
        }
        return false;
    }
    
    boolean ispresent(Stack<Integer> stack , ArrayList<ArrayList<Integer>> graph , int N, int v)
    {
        stack.push(v);
        if(stack.size() == N)
        {
            return true;
        }
        for(int w: graph.get(v))
        {
            if(stack.search(w) == -1)
            {
                if(ispresent(stack,graph,N,w))
                {
                    return true;
                }
            }
        }
        stack.pop();
        return false;
    }
} 


