// https://practice.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions



class Solution{
    
    int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum +=((long)arr[i]*i)%1000000007 ;
        }
        
        return (int)(sum%1000000007);
        
    }   
}

