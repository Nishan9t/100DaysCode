//   https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/


class Solution {
    public int[] restoreArray(int[][] arr) {
        // The idea is to find the start or end element in the answer array. To do so , we can push all the elements into a map. The Start/End element will only have one neigbour. So check the map to see which element has only one neigbour.
       
       Map<Integer, List<Integer>> map = new HashMap<>();
       for(int i=0;i<arr.length; i++)
       {
           //adding list<Integer> to every distinct element
           map.putIfAbsent(arr[i][0] , new ArrayList<>());
           map.putIfAbsent(arr[i][1] , new ArrayList<>());
            //adding adjacent value to each distinct element
           map.get(arr[i][0]).add(arr[i][1]);
           map.get(arr[i][1]).add(arr[i][0]);
       }
       int start=0;
       int count =1,prev=start;
       int[] ans =new int[arr.length+1];

        //finding start element
       for(Integer key: map.keySet())
       {
           if(map.get(key).size() ==1)
           {
               start=key;
               break;
           }
       }
       ans[0] =start;
       while(count < arr.length +1)
       {
           //getting neighbouring element of starting element
           List<Integer> ansSet=map.get(start);
           if(ansSet.get(0) !=prev)
           {
               ans[count++] = ansSet.get(0);
           }
           else{
               ans[count++]=ansSet.get(1);
           }
           prev = start;
           start = ans[count-1];
       }
       return ans;
        
    }
}


