// https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Divide%20and%20Conquer&sortBy=submissions



//divide and conquer
class Solution 
{
    int findOnce(int arr[], int n)
    {
        int result = findSingle(arr,0,n-1);
        return result;
    }

    public static int findSingle(int[] arr , int low , int high )
    {
        // Base case
        if (low > high) {
            return -1;
        }

        // If only one element is present
        if (low == high) {
            return arr[low];
        }

        int mid = (low + high) / 2;


        // If mid element is the answer
        if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
            return arr[mid];
        }

        // If mid element is equal to its left neighbor
        if (arr[mid] == arr[mid - 1]) {
            // If left neighbor index is even, single element is in right half
            if ((mid - 1) % 2 == 0) {
                return findSingle(arr, mid + 1, high);
            }
            // Else, single element is in left half
            else {
                return findSingle(arr, low, mid - 2);
            }
        }
        // If mid element is equal to its right neighbor
        else {
            // If right neighbor index is even, single element is in right half
            if ((mid + 1) % 2 == 0) {
                return findSingle(arr, mid + 2, high);
            }
            // Else, single element is in left half
            else {
                return findSingle(arr, low, mid - 1);
            }
        }
    }
}


//bitwise approach

class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int temp = arr[0];

        for(int i=1;i<n;i++)
        {

            //XOR of all elements
            //if two elements will be same then ther XOR will be 0;
            temp = temp ^ arr[i];
        }
        return temp;
    }
}







