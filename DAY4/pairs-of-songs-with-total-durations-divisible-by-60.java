//  https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/description/




class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int[] freq = new int[60];
        int res=0;
        for(int t: time){
            int val = t%60;
            if(val==0)
            {
                res +=freq[0];
            }
            else{
                res +=freq[60-val];
            }
            freq[val]++;
        }
        return res;
    }
}
