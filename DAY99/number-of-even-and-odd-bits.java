// https://leetcode.com/problems/number-of-even-and-odd-bits/



class Solution {
    public int[] evenOddBit(int n) {
        int[] ans =new int[2];
        int even=0;
        int odd=0;
//place will be true for even and false for odd places
        boolean place=true;
        while(n>0)
        {
            int bit= n%2;
            if(bit==1 && place)
            {
                even++;
            }
            else if(bit ==1 && !place){
                odd++;
            }
            n=n/2;
            place =!place;
        }
        ans[0]=even;
        ans[1]=odd;
        return ans;

    }
}



