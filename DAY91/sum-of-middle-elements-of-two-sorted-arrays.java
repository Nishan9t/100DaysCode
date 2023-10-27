// https://practice.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Divide%20and%20Conquer&sortBy=difficulty





class Solution {
    int findMidSum(int[] arr1, int[] arr2, int n) {
       int sum=0;
         int i=0,j=0,k=0;
         while(i<n && j<n)
         {
             if(arr1[i]>arr2[j])
             {
                 k++;
                 if(k==n || k==n+1)
                   sum+=arr2[j];
                   j++;
             }
             else
             {
                 k++;
                 if(k==n || k==n+1)
                   sum+=arr1[i];
                   i++;
             }
         }
         while(i<n)
         {
              k++;
                 if(k==n || k==n+1)
                   sum+=arr1[i];
                   i++;
         }
         while(j<n)
         {
            k++;
                 if(k==n || k==n+1)
                   sum+=arr2[j];
                   j++; 
         }
         return sum;
    }
}
