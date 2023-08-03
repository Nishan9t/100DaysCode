// https://leetcode.com/problems/k-diff-pairs-in-an-array/



class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> uniquePair=new HashSet();
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=0; i<n;i++)
        {
            if(i==0 || nums[i]!=nums[i-1])
            {
                for(int j=i+1;j<n;j++)
                {
                    if(Math.abs(nums[i]-nums[j])==k){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
        
    }
}
