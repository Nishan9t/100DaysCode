//  https://leetcode.com/problems/combinations/


class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        combinations(ans,list,n,k,1);
        return ans;
    }
    private void combinations(List<List<Integer>> ans, List<Integer> list, int n,int k ,int start)
    {
        if(list.size()==k)
        {
            ans.add(new ArrayList<>(list));
        }
        for(int i=start;i<=n;i++)
        {
            list.add(i);
            combinations(ans,list,n,k,i+1);
            list.remove(list.size()-1);
        }
    }
}

