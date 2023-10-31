// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences



class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;
        for(String currSent : sentences)
        {
            int currLen = currSent.split(" ").length;
            if(maxLen < currLen)
            {
                maxLen = currLen;
            }
        }
        return maxLen;

    }
}
