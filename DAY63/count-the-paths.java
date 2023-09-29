// https://practice.geeksforgeeks.org/problems/count-the-paths4332/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions



class Solution
{
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        
        for(int[] e:edges)
        {
            int u=e[0];
            int v=e[1];
            
            l.get(u).add(v);
        }
        return countPath(l,s,d);
        
    }
    
    public int countPath(List<List<Integer>> list , int s , int d)
    {
        if(s==d)
       {
           return 1;
       }
       int count =0;
       for(int v: list.get(s))
       {
           count +=countPath(list,v,d);
       }
       return count;
    }
}
