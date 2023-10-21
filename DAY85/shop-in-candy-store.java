//  https://practice.geeksforgeeks.org/problems/shop-in-candy-store1145/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){


   ArrayList<Integer> list = new ArrayList<Integer>();

        Arrays.sort(arr);
        int M = N;
        int mincost = 0;
        int maxcost = 0;

        for(int i=0;i<N;i++)
        {
            mincost += arr[i];
            N -= K;

        }
        int s = 0;
        for(int i=M-1;i>=s;i--)
        {
            maxcost += arr[i];
            s += K;
        }
    //   System.out.println(maxcost);

        list.add(mincost);
        list.add(maxcost);
        return list;



    }
}


