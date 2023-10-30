// https://leetcode.com/problems/valid-anagram/


class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars,tChars);
    }
}


//using array as hashmap


class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        //count the frequency of character in string s
        for(char x: s.toCharArray())
        {
            count[x-'a']++;
        }
        //decrement the frequenct of character in string t
        for(char x: t.toCharArray())
        {
            count[x-'a']--;
        }  
        //check if any character has non-zero frequenct
        for(int val: count)
        {
            if(val != 0)
            {
                return false;
            }
        }
        return true;

    }
}

