//   https://leetcode.com/problems/palindrome-number


class Solution {
    public boolean isPalindrome(int x) {
        int k=x;
        int rev=0;
        while(k>0)
        {
            int rem=k%10;
            rev=rev*10+rem;
            k=k/10;
        }
        if(rev==x)
        {
            return true;
        }
        return false;
    }
}

