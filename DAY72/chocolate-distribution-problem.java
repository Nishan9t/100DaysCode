// https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        long min=Integer.MAX_VALUE;
        Collections.sort(a);
        
        for(int i=0;i<=n-m;i++)
        {
            int x=a.get(i);
            int y=a.get(i+m-1);
            int diff = y-x;
            if(diff<min)
            {
                min=diff;
            }
        }
        return min;
    }
}