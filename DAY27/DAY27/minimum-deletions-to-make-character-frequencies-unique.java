//   https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique


class Solution {
    public int minDeletions(String s) {
        // Count frequency of each letter
        // Sort the frequencies
        // From the letter with highest frequency, for each letter we keep no more than previous letter
        // Total number - number we kept = number we want to delete
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int keep =freq[25],prev=keep;
        //keeping the length of highest freq char 
        //after that making each char length to -1 to make it small from prev high freq cahr
        for(int i=24; i>=0 && freq[i]!=0 && prev!=0 ; i--)
        {
            prev = Math.min(freq[i] , prev-1);
            keep += prev;
        }
        return s.length()-keep;
        
    }
}
