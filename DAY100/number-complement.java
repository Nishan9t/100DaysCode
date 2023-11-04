// https://leetcode.com/problems/number-complement/



class Solution {
    public int findComplement(int num) {
        int n= num;
        int k = 0; //bits
        while(n>0)
        {
            k++;
            n= n>>1;
        }
        //to get digit with all 1's of length k
        int mask = (1<<k)-1;
        return num^mask; 

    }
}







