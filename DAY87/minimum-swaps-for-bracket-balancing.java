//  https://practice.geeksforgeeks.org/problems/minimum-swaps-for-bracket-balancing2704/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions




class Solution{
    static int minimumNumberOfSwaps(String S){

        int extra =0;
        int ans =0;

        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='[')
            {
                if(extra>0)
                {
                    ans +=extra;
                }
                extra--;
            }
            else if(S.charAt(i)==']')
            {
                extra++;
            }
        }
        return ans;
    }
}





