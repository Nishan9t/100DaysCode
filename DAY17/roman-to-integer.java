//  https://leetcode.com/problems/roman-to-integer/


class Solution {
    int getVal(char ch)
    {
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default :return 0;
        }
    }
    public int romanToInt(String s) {
        
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if( (i+1)<s.length() && getVal(s.charAt(i))<getVal(s.charAt(i+1))  )
            {
                sum = sum-getVal(s.charAt(i));
            }
            else
            {
                sum =sum + getVal(s.charAt(i));
            }
        }
        return sum;
    }
}



