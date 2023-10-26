// https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array0959/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Divide%20and%20Conquer&sortBy=submissions



class Solution 
{ 
    static int Search(int array[], int target)
  {
      int low =0;
      int high = array.length-1;

      //modified binary search

      while(low <=high)
      {
          int mid =(low+high)/2;

          if(array[mid] == target)
          {
              return mid;
          }

          //means left sub-array is sorted

          if(array[low] <= array[mid])
          {
              //when target also lies in range low to mid-1
              if(target >=array[low] && target < array[mid])
              {
                  //perform binary search in left subarray
                  high = mid-1;
              }
              else{
                  low = mid+1;
              }
          }
          else{
              //when target also lies in range mid+1 to high
              if(target>array[mid] && target<=array[high])
              {
                  low = mid+1;
              }
              else{
                  high = mid-1;
              }
          }
      }
      return -1;
  }
} 
