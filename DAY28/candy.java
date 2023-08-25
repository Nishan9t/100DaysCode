//   https://leetcode.com/problems/candy



class Solution {
    public int candy(int[] ratings) {
       
       int[] arr =new int[ratings.length];
       Arrays.fill(arr,1);
        //minimum candies should be ratings.length
       int ans= ratings.length;
        while(true)
        {
            //this loop will continues till all elements not satisfied both if conditions
            boolean bool=false;
            for(int i=0; i<ratings.length-1 ; i++)
            {
                if(ratings[i] > ratings[i+1] && arr[i] <= arr[i+1])
                {
                    arr[i]++;
                    ans++;
                    bool=true;
                }
                if(ratings[i] < ratings[i+1] && arr[i] >=arr[i+1])
                {
                    arr[i+1]++;
                    ans++;
                    bool=true;
                }
            }
            if(!bool)
            {
                break;
            }
        }
        // for(int i=0;i<ratings.length;i++)
        // {
        //     System.out.println(arr[i]);
        //  }
        return ans;
        
    }
}
