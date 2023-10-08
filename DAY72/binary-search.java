// https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions

class Solution {
    int binarysearch(int arr[], int n, int k) {
       int start=0;
        int end=n-1;
        int mid=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            if(k>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    return -1;
    }
}
