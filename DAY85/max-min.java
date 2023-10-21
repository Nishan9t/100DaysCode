//  https://practice.geeksforgeeks.org/problems/max-min/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions



class Solution
{ 
    public static int findSum(int arr[],int N) 
    {
        int min=arr[0];
        int max = arr[0];
        for(int i=0;i<N;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max+min;
    }
}

