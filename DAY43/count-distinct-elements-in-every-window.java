//   https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1






class Solution
{
     ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here
        int i =0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
     
      while(j<n){
          if(map.containsKey(arr[j])){
            map.put(arr[j], map.get(arr[j])+1);
          } else{
            map.put(arr[j], 1);
          }
        if(j-i+1<k){
            j++;
        } else if(j-i+1 == k){
           list.add(map.size());
          if(map.get(arr[i])>=2){
            map.put(arr[i], map.get(arr[i])-1);
          } else{
            map.remove(arr[i]);
          }
            i++;
            j++;
        }
      }
      return list;
    }
}





