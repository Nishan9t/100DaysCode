// https://practice.geeksforgeeks.org/problems/find-the-median0527/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Divide%20and%20Conquer&sortBy=submissions



class Solution
{
    public int find_median(int[] v)
    {

        Arrays.sort(v);
        if(v.length%2==0)
        {
            return (v[v.length/2] + v[v.length/2-1])/2;

        }
        else{
            return v[v.length/2];
        }
    }
}








