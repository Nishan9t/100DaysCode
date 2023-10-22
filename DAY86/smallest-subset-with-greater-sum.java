//  https://practice.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class Solution { 
    int minSubset(int[] Arr,int N) { 

        long totalSum=0;
        Arrays.sort(Arr);

        for(int i=0;i<N;i++)
        {
            totalSum +=Arr[i];

        }


        int j;
        long currsum=0;
        for(j=N-1;j>=0;j--)
        {
            currsum+=Arr[j];
            totalSum -=Arr[j];
            if(currsum > totalSum)
            {
                return N-j;
            }

        }
        return N;

    }
}




