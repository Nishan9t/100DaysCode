//  https://practice.geeksforgeeks.org/problems/largest-number-with-given-sum-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int s)
    {
        StringBuilder sb = new StringBuilder();

        while(s >=9)
        {
            sb.append("9");
            s -=9;
        }

        if(s >0)
        {
            sb.append(""+(s%9));
        }

        if(sb.length() >n)
        {
            return "-1";
        }
        if(sb.length() < n)
        {
            while(sb.length()<n)
            {
                sb.append("0");
            }
        }

        return sb.toString();
    }
}



