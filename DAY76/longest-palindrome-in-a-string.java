// https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Algorithms&sortBy=submissions


class Solution{
    static String longestPalin(String S){
        if(S == null || S.length()==0)
        {
            return "";
        }
        
        String longest="";
        for(int i=0;i<S.length();i++)
        {
            //for odd length palindromes
            
            String pal1 = expandAroundCenter(S,i,i);
            if(pal1.length() > longest.length()){
                longest = pal1;
            }
            
            //for even length palindromes
            String pal2= expandAroundCenter(S,i,i+1);
            if(pal2.length() > longest.length())
            {
                longest = pal2;
            }
        }
        return longest;
    }
    
    public static String expandAroundCenter(String s , int left , int right)
    {
        while(left >=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        
        return s.substring(left+1,right);
    }
}
