// https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


//TLE
class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        int k=arr.length;
        long n=0;
        int i=0;
        int j=1;
        while(i<k)
        {
            if(j==k)
            {
                i++;
                j=i+1;
            }
            else{
                if(arr[i]>arr[j])
                {
                    n++;
                    j++;
                }
                else{
                    j++;
                }
            }
           
            
        }
         return n;
        
       
    }
}
