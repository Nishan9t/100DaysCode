//https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions


class Solution {
    int remove_duplicate(int A[],int N){
        int i=0;
        int j=0;
        
        while(j<N)
        {
            if(i==j || A[i]==A[j])
            {
                j++;
            }
            else if(A[i]!=A[j])
            {
                i++;
                A[i]=A[j];
                j++;
            }
        }
        return i+1;
    }
}
