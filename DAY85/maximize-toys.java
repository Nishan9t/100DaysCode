//  https://practice.geeksforgeeks.org/problems/maximize-toys0331/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        Arrays.sort(arr);

        for(int i=0;i<N;i++)
        {
            if(K<arr[i])
           {
               return i;
           }
           if(K >= arr[i])
           {
               K -=arr[i];
           }

        }
        return N;
    }
}


