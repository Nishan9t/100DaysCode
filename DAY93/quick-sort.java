// https://practice.geeksforgeeks.org/problems/quick-sort/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Divide%20and%20Conquer&sortBy=difficulty



class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low <high)
        {
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {

        int pivot = arr[high];
        int i=low-1;//it contains the index till where all values are less than pivot

        for(int j=low;j<high;j++)
        {
            if(arr[j] < pivot)
            {
                i++;

                //swap
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }

        //swap the pivot to I to position the pivot at correct position
        int t= arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=t;

        return (i+1);

    } 
}
