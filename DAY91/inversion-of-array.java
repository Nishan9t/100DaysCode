// https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Divide%20and%20Conquer&sortBy=difficulty




class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr,0,(int)N-1);
    }

    private static long mergeSort(long[] arr, int l, int h)
    {
        if(l<h)
        {
            int mid= l+(h-l)/2;
            long l1= mergeSort(arr,l,mid);
            long l2= mergeSort(arr,mid+1,h);
            long l3= merge(arr,l,mid,h);

            return (l1+l2+l3);

        }
        else
        {
            return 0;
        }

    }

    private static long merge(long[] arr, int l, int mid, int h)
    {
        long[] b = new long[h-l+1];
        int i=l;
        int j=mid+1;
        int k=0;

        long count =0;

        while(i<=mid && j<=h)
        {
            if(arr[i]>arr[j])
            {
                b[k++] = arr[j++];
                count +=(mid-i+1);
            }
            else{
                b[k++]= arr[i++];

            }
        }
        while(i<=mid)
        {
            b[k++]=arr[i++];
        }
        while(j<=h)
        {
            b[k++]= arr[j++];
        }

        int t=l;
        for(k=0;k<b.length;k++)
        {
            arr[t++] = b[k];
        }
        return count;
    }
}

