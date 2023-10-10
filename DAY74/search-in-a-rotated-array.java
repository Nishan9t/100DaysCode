// https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions


class Solution
{
    int search(int arr[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        
        int ans =-1;
        for(int i=l;i<=h/2;i++)
        {
            if(arr[i]==key)
            {
                ans =i;
            }
            if(arr[h-i]==key)
            {
                ans=h-i;
            }
        }
        return ans;
    }
}
