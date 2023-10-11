// https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


class Solution{
    static int minJumps(int[] arr){
        int n=arr.length;
        int jumps =0;
        //pos contains the position from where we are currently jumping
        int pos=0;
        //it contains the element we can react from current index
        int dest=0;
        
        for(int i=0;i<n-1;i++)
        {
            dest = Math.max(dest,i+arr[i]);
            //if arr[i]==0
            if(i==dest)
            {
                return -1;
            }
            //whenver we reach the index which will be last element we can reach from pos then increase jumps
            //ans dest will become new pos
            if(pos==i)
            {
                pos = dest;
                jumps++;
            }
        }
        return jumps;
    }
}
