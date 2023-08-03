// https://leetcode.com/problems/subarray-sums-divisible-by-k/


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int sum=0,count=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums)
        {
            sum+=num;
            int key=(sum%k+k)%k;  //k is added to handle negative remainders [-4 % 9 = -5 and (-5 + 9) % 9 = 4]
            count +=map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
}
