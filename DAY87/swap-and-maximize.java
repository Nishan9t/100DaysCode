// https://practice.geeksforgeeks.org/problems/swap-and-maximize5859/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class GFG
{
    long maxSum(long arr[] ,int n)
    {

        Arrays.sort(arr);

        int b=0;
        int l=n-1;

        long sum =0;
        while(b<=l)
        {
            sum +=Math.abs(arr[b]-arr[l]);
            b++;
            l--;
        }
        return 2*sum;

    }
}






