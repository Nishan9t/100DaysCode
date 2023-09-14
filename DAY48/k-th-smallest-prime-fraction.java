// https://leetcode.com/problems/k-th-smallest-prime-fraction


class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
            //max heap
         PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                double x = a[0] / (1.0 * a[1]);
                double y = b[0] / (1.0 * b[1]);
                return x > y? -1 : 1;
            }
        );
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                pq.add(new int[]{arr[i],arr[j]});
                //we only want kth max 
                //so whenever pq.size()>k
                //we remove current max fraction
                if(pq.size()>k)
                {
                    pq.remove();
                }
            }
        }
        return pq.remove();
        
    }
}
