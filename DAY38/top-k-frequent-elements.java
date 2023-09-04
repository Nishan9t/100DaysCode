//   https://leetcode.com/problems/top-k-frequent-elements



class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        //get elements in a list
        //list is containing only key of hashmap
        List<Integer> l =new ArrayList<>(hm.keySet());
        
        //sort the list based on decreasing frequency
        Collections.sort(l,(a,b)->hm.get(b)-hm.get(a));
        //get the top k frequent elements in an array
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = l.get(i);
        }
        return ans;
        
    }
}
