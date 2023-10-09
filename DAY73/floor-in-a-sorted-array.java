// https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int i=0;
        while(i<n)
        {
            //if x is bigger than all elements then last index will be K
            if(i == n-1)
            {
                return n-1;
            }
            else if(arr[i]>x)
            {
                return i-1;
            }
            i++;
        }
        return -1;
        
        
        
    }
    
}