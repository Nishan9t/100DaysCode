// https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


class Solution
{
    
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int count=0;
        int plat=0;
        
       while(i<n && j<n){
          if(arr[i]<=dep[j]){
              plat++;
              i++;
          } else{
              plat--;
              j++;
          }
          count=Math.max(count,plat);
       }
        return count;
        
    }
    
}
