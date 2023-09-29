// https://practice.geeksforgeeks.org/problems/sum-of-dependencies-in-a-graph5311/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions



class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
       int ans = 0;
        for(int i=0;i<V;i++)
            ans+=adj.get(i).size();
            
        return ans;
    }
};
