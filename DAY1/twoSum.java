// https://leetcode.com/problems/two-sum/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
      
        HashMap<Integer,Integer> hm=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            int want=target-nums[i];
            if(!hm.containsKey(want))
            {
                hm.put(nums[i],i);
            }
            else{
                int res=hm.get(want);
                ans[0]=res;
                ans[1]=i;
                break;
                
            }
        }
        return ans;
    }
}
