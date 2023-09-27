// https://leetcode.com/problems/all-paths-from-source-to-target



class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      List<List<Integer>> allPaths = new ArrayList<List<Integer>>();
      List<Integer> list = new ArrayList<>();
      list.add(0);
      backtracking(allPaths,list,0,graph);
      return allPaths;
        
    }
    public void backtracking(List<List<Integer>> allPaths, List<Integer> list, int index, int[][] graph)
    {
        if(index==graph.length-1)
        {
            allPaths.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<graph[index].length;i++)
        {
            list.add(graph[index][i]);
           // backtracking to index = graph[index][i] means going to node which just added in list to check the further path from that node
            backtracking(allPaths,list,graph[index][i],graph);
            list.remove(Integer.valueOf(graph[index][i]));
        }
    }
}


