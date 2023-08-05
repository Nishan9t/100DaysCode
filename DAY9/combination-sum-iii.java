//  https://leetcode.com/problems/combination-sum-iii/

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        combination(1,k,n,list,ans);
        return ans;
        
    }
    public void combination(int start,int k,int n,List<Integer> list,List<List<Integer>> ans)
    {
        if(n==0 && list.size()==k)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=9;i++)
        {
            list.add(i);
            combination(i+1,k,n-i,list,ans);
            list.remove(list.size()-1);
        }
    }
}
