// https://practice.geeksforgeeks.org/problems/merge-sort/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Divide%20and%20Conquer&sortBy=difficulty




class Solution
{
    void merge(int arr[], int l, int m, int r)
    {

       int[] out=new int[r-l+1];
       int k=0;
       int i=l;//for 1st subarray
       int j=m+1;//for 2nd subarray


       while(i<=m && j<=r)
       {
           if(arr[i] <= arr[j])
           {
               out[k++]=arr[i++];
           }
           else{
               out[k++]=arr[j++];
           }
       }

       while(i<=m)
       {
           out[k++]=arr[i++];
       }
       while(j<=r)
       {
           out[k++]=arr[j++];
       }

       //putting all the data in array
       k=0;
       for(int x=l;x<=r;x++)
       {
           arr[x]=out[k++];
       }




    }
    void mergeSort(int arr[], int l, int r)
    {

      if(l>=r)
      {
          return;
      }
      int m=l+(r-l)/2;
      mergeSort(arr,l,m);
      mergeSort(arr,m+1,r);
      merge(arr,l,m,r);

    }
}

