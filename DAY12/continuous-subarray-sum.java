//  https://leetcode.com/problems/continuous-subarray-sum/


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      int sum=0;
      HashMap<Integer,Integer> hm=new HashMap<>();
     
      for(int i=0;i<nums.length;i++)
      {
            sum+=nums[i];
           int rem=sum%k;
           if(i!=0 && rem==0)
           {
               return true;
           }
            if(hm.containsKey(rem))
            {
                if(i-hm.get(rem) >=2) return true;
            }
            else{
                hm.put(rem,i);
            }

        }
       return false;


    }
}




