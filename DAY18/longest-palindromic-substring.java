//  https://leetcode.com/problems/longest-palindromic-substring/


class Solution {
    public String longestPalindrome(String s) {
        int start =0, end=0;
        //for middle char
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int left =i;
            int right=i;
            //for left common characters of middle char
            while(left>=0 && s.charAt(left)==c){
                left--;
            }
            //for right common characters of middle chat
            while(right <s.length() && s.charAt(right)==c)
            {
                right++;
            }
            //checking the same characters at right and left of middle characters
            while(left >=0 && right <s.length())
            {
                //if not same
                if(s.charAt(left) !=s.charAt(right))
                {
                    break;
                }
                //if left == right
                left--;
                right++;
            }
			//left should be increment because palindrome will start from the index+1 from the char which does not match
			
			//right should not decrement beacuses substring(I,j) j is not included
            left+=1;
            if(end-start < right-left)
            {
                start =left;
                end=right;
            }
        }
        return s.substring(start,end);
        
    }
}




