// https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions


class Solution {
    int countTriplet(int arr[], int n) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        
        int ans=0;
       
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(set.contains(arr[i]+arr[j]))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}
