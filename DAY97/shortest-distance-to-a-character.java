// https://leetcode.com/problems/shortest-distance-to-a-character



class Solution {
    public int[] shortestToChar(String s, char c) {

        int[] result = new int[s.length()];
        //find the first occurance of c
        int next = moveForward(s,c,0);
        int previous = next;
        for(int i=0; i<s.length(); ++i)
        {
            if(i > next)
            {
                previous = next;
                next = moveForward(s,c,next+1);
            }
            result[i] = Math.abs(Math.min(next-i , i-previous));
        }
        return result;
    }
    private int moveForward(String s, char c, int position)
    {
        while(position < s.length())
        {
            if(s.charAt(position) == c)
            {
                break;
            }
            ++position;
        }
        //when 'c' does not occur further in the string , return MAX value
        //This makes 'previous' as the only valid closest occurrence
        if(position == s.length())
        {
            return Integer.MAX_VALUE;
        }
        return position;
    }
}
