// https://leetcode.com/problems/find-the-difference/



class Solution {
    public char findTheDifference(String s, String t) {

// if we take XOR of every character. all the n character of s "abc" is similar to n character of t "cab". So, they will cancel each other. 
// And we left with our answer.
        char c = 0;
        for(char cs : s.toCharArray())
        {
            c ^= cs;
        }
        for(char ct : t.toCharArray())
        {
            c ^= ct;
        }
        return c;

    }
}





