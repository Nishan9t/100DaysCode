// https://leetcode.com/problems/ugly-number-ii/


class Solution {
    public int nthUglyNumber(int n) {

        PriorityQueue<Long> pq =new PriorityQueue<>();
        pq.add(1l);
        n=n-1;

        while(n>0)
        {
            //getting and removing smallest element
            //and mutliplying it with 2,3,5 and storing the value in priotity queue
            long a = pq.poll();
            if(!pq.contains(a*2))
            {
                pq.add(a*2);
            }
            if(!pq.contains(a*3))
            {
                pq.add(a*3);
            }
            if(!pq.contains(1*5))
            {
                pq.add(a*5);
            }
            n--;
        }

        long ans =pq.poll();
        return (int) ans;
        
    }
}