// https://leetcode.com/problems/subarrays-with-k-different-integers/



class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return solution(arr,k)-solution(arr,k-1);
        
    }
    public int solution(int[] arr, int k)
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        int j=0;
        int ans=0;
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0) +1);
            while(map.size() >k)
            {
                if(map.get(arr[j]) >1)
                {
                    map.put(arr[j],map.get(arr[j])-1);
                }
                else{
                    map.remove(arr[j]);
                }
                j +=1;
            }
            ans +=(i-j)+1;
        }
        return ans;
    }
}




