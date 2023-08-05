//  https://leetcode.com/problems/subsets-ii/


class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        subset2(0,nums,list,ans);
        return ans;
        
    }
    private void subset2(int ind, int[] arr,ArrayList<Integer> list, List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++)
        {
            if(i!=ind && arr[i]==arr[i-1])
            {
                continue;
            }
            list.add(arr[i]);
            subset2(i+1,arr,list,ans);
            list.remove(list.size()-1);
        }
    }
}
