//  https://leetcode.com/problems/permutations-ii/


class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        backtrack(list,new ArrayList<>(),nums,new boolean[nums.length]);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums,boolean[] vis)
    {
        if(templist.size()==nums.length)
        {
            list.add(new ArrayList<>(templist));
            return;
        }
        else{
            for(int i=0;i<nums.length;i++)
            {
                if(vis[i]) continue ; //if current element is already present in the temp,skip the element
                if(i>0&& !vis[i-1] && nums[i]==nums[i-1]) continue; // if prev element and current element is equal, skip the element
                vis[i]=true;
                templist.add(nums[i]);
                backtrack(list,templist,nums,vis);
                templist.remove(templist.size()-1);
                vis[i]=false;
            }
        }
    }
}
