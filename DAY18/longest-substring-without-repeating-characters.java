//  https://leetcode.com/problems/longest-substring-without-repeating-characters/

//two pointer

class Solution {
    public int lengthOfLongestSubstring(String s) {
          Map<Character,Integer>uniq= new HashMap<>();
              int left=0,right=0,longestSubstringCount= 0;
                while(right<s.length())
            {
              if(uniq.containsKey(s.charAt(right)))
              {
                  left = Math.max(uniq.get(s.charAt(right))+1,left);
              }
              uniq.put(s.charAt(right),right);
              longestSubstringCount = Math.max(longestSubstringCount,right-left+1);
            right++;
    } 
     return longestSubstringCount; 
    }
}


//set approach

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> set =new HashSet<>();
        while(j<s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                max=Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
        
    }
}





