//  https://practice.geeksforgeeks.org/problems/ticket-counter-2731/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class Solution {
    public static int distributeTicket(int N,int K)
    {
        ArrayDeque<Integer> queue= new ArrayDeque<>();

        int ans=0;
        boolean flag=true;

        for(int i=1;i<=N;i++)
        {
            queue.offer(i);
        }

        while(queue.size() > K)
        {
            for(int i=0;i<K;i++)
            {
                if(flag)
                {
                    queue.pollFirst();
                }
                else{
                    queue.pollLast();
                }
            }
            flag =!flag;
        }

        return flag? queue.pollLast() : queue.pollFirst();
    }
}






