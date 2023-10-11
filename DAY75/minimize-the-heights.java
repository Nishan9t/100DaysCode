// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0]; //assuming no difff is bigger than this
 
        int smallest = arr[0]+k;
        
        int largest = arr[n-1]-k;
        
        int MIN,MAX;
        
        for(int i=0;i<n-1;i++)
        {
            MIN = Math.min(smallest,arr[i+1]-k); //trying to make all the tower to be min except first
            MAX = Math.max(largest,arr[i]+k); //trying to make all the tower to be max except last
            
            if(MIN<0)
            {
                continue;
            }
            
            ans = Math.min(ans,MAX-MIN);
        }
        return ans;
    }
}
