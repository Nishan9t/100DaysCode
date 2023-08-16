//   https://leetcode.com/problems/reverse-words-in-a-string/




class Solution {
    public String reverseWords(String s) {
       // To split a string by space, use \\s+. It will split the string by single or multiple whitespace characters such as space, tab, etc.
        //trim the input string to remove leading and trailing spaces
        String[] str=s.trim().split("\\s+");
        //initialize the output string
        String out="";
        //iterate through the words in reverse order
        for(int i=str.length-1; i>0;i--)
        {
            //append the current word and a space to the output
            out +=str[i]+" ";
        }
        //append the first word to the output (without trailing space)
        return out+str[0];
        
    }
}

