//  https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/






class Solution {
    public int longestSubstring(String s, int k) {

        int maxLen = 0;
        if(s.length() ==1 && k==1)
        {
            return s.length();
        }
        if(s.length()<k)
        {
            return 0;
        }

        for(int i=1;i<s.length();i++)
        {
            int count[] =new int[26];
            int start=0,end=0,uniquechar=0,charatLeastK=0;

            while(end<s.length())
            {
                if(uniquechar <=i)
                {
                    int idx = (s.charAt(end)-'a');
                
                    if(count[idx]==0)
                    {
                        uniquechar++;
                    }
                    count[idx]++;

                    if(count[idx]==k)
                    {
                        charatLeastK++;
                    }
                    end++;
                }
                else{
                    int idx =(s.charAt(start)-'a');
                    if(count[idx]==k)
                    {
                        charatLeastK--;
                    }
                    count[idx]--;
                    if(count[idx]==0)
                    {
                        uniquechar--;
                    }
                    start++;
                }
                if(uniquechar==i && charatLeastK==uniquechar)
                {
                    maxLen =Math.max(maxLen,end-start);
                }
            }
        }
        return maxLen;
        
    }
}