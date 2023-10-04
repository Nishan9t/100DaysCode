// https://practice.geeksforgeeks.org/problems/find-optimum-operation4504/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions



class Solution
{
    public int minOperation(int n)
    {
        int ans =0;
        //decreasing n accoriding to situation to 0;
        while(n>0)
        {
            //if odd
            if(n%2!=0)
            {
                //decrease by 1
                n--;
            }
            //if even 
            else 
            {
                //divide by 2
                n=n>>1;
            }
            ans++;
        }
        return ans;
    }
}
