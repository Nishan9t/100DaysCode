// https://practice.geeksforgeeks.org/problems/maximum-weight-node--170645/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions



class Solution{
    public int maxWeightCell(int N, int Edge[]){
        
        int arr[] = new int[N];
        
        
        
        for(int i=0;i<N;i++)
        {
            int cell=Edge[i];
            if(cell >=0)
            {
                arr[cell]+=i;
            }
           
        }
        
        // for(int i=0;i<N;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        int max=-1;
        int maxInd=-1;
        for(int i=N-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxInd=i;
            }
        }
        
        return maxInd;
       
    }
}
