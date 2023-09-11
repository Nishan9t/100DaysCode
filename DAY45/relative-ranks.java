//  https://leetcode.com/problems/relative-ranks/




class Solution {
    public String[] findRelativeRanks(int[] arr) {

        int n = arr.length;

        //to store elements in decreasing order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        int index =1;
        while(!pq.isEmpty())
        {
            if(index==1)
            {
                map.put(pq.poll(),"Gold Medal");
            }
             else if(index == 2){
                map.put(pq.poll(), "Silver Medal");
            }
            else if(index == 3){
                map.put(pq.poll(), "Bronze Medal");
            }
            else{
                map.put(pq.poll(), Integer.toString(index));
            }

            index++;
        }
        String[] ans= new String[n];
        for(int i=0;i<n;i++)
        {
            ans[i]= map.get(arr[i]);
        }

        return ans;
        
    }
}