// https://leetcode.com/problems/longest-palindrome




class Solution {
    public int longestPalindrome(String s) {
        int length=0;
        HashSet<Character> hset = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            char character = s.charAt(i);
      // If hset contains character already, emove that character & adding 2 to length...
            // It means we get pair of character which is used in palindrome...
            if(hset.contains(character))
            {
                length +=2;
                hset.remove(character);
            }
            else{
                hset.add(character);
            }
        }
        //if hset.size() >0 it means we can take a single value and place in middle of palindrome 
        if(hset.size()>0)
        {
            length++;
        }
        return length;


    }
}





