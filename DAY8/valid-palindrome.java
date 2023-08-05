// https://leetcode.com/problems/valid-palindrome




//TWO POINTER


class Solution {
    public boolean isPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            char leftChar=s.charAt(left);
            char rightChar=s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar))
            {
                left++;
                continue;
            }
             if(!Character.isLetterOrDigit(rightChar))
            {
                right--;
                continue;
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
            {
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
}


//RECURSIVE APPROACH


class Solution {
    public boolean isPalindrome(String s) {
        
       s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       int n=s.length();
       return check(s,0,n);
    }
    public boolean check(String s,int i, int n)
    {
        if(i>=n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return check(s,i+1,n);
    }
}

