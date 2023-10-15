// https://practice.geeksforgeeks.org/problems/subsets-1613027340/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Backtracking&sortBy=submissions




class Solution
{
    
    
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        
         helper(A,0,ans,ds);
         
         Collections.sort(ans, (o1, o2) -> {
            int n = Math.min(o1.size(), o2.size());
            for (int i = 0; i < n; i++) {
                if (o1.get(i) == o2.get(i)) {
                    continue;
                }
                else {
                    // sort based on the unequal elements value
                    return o1.get(i) - o2.get(i);
                }
            }
            // sort based on size
            return o1.size() - o2.size();
        });
        return ans;
       
    }
    
     public static void helper(ArrayList<Integer> arr,int index,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer>ds)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.size();i++)
        {
            ds.add(arr.get(i));
            helper(arr,i+1,ans,ds);
            ds.remove(ds.size()-1);
         }
    }
    
}
