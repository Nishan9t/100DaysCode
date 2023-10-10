// https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions


class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
          
    Arrays.sort(arr);
 
    int l = 0;
    int r = 1;
 
    n = Math.abs(n);
 
    while (l <= r && r < size) {
        int diff = arr[r] - arr[l];
        //l!=r beacuse if diff==0 then arr[i]-arr[i] =0 , but we can't take a pair of same element 
        if (diff == n && l != r) 
        {
            return true;
        }
        else if (diff > n) {
             l++;
        }
           
        else {
            r++;
        }
            
    }
 
    return false;
       
    }
}
