// https://leetcode.com/problems/detect-capital/



class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() <= 1)
        {
            return true;
        }
        char capA ='A';
        char capZ ='Z';
        boolean initialCap = word.charAt(0) >= capA && word.charAt(0) <= capZ;
        boolean isLeadingCharacterCap = word.charAt(1) >= capA && word.charAt(1) <= capZ;
        //case: aA
        if(!initialCap && isLeadingCharacterCap)
        {
            return false;
        }
        for(int i=2;i<word.length();i++)
        {
            char chr = word.charAt(i);
    // if first word is not capital but there is some capital letter in middle
            if(chr >=capA && chr<=capZ)
            {
                if(!isLeadingCharacterCap) return false;
            }
//if first character is capital but there is some other capital letter and all lettters are not capital
            else{
                if(isLeadingCharacterCap) return false;
            }
        }
       return true; 
    }
}

