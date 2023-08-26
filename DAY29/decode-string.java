//   https://leetcode.com/problems/decode-string



class Solution {
    private int pos=0;
    public String decodeString(String s) {
//          The idea is: for the string in [ ] pair, we can recurse it as the source string.           The    codes go into the lower level at '[', and back to parent at ']'.
// The int pos is a globle parameter to indicate the current index of char in the String s.
    
    int n= s.length();
    //repeat taking the how many time we have to repeat
   
    int repeat=0;
    StringBuilder buf= new StringBuilder();
    while(pos<n)
    {
        char c=s.charAt(pos);
        if(c >='a' && c<='z')
        {
            buf.append(c);
        }
        else if(c >='0' && c<='9')
        {
            repeat = repeat *10 +(c-'0');
        }
        else if(c=='[')
        {
            pos++; //skip the char '['
            String str=decodeString(s);//pos is different for each cell
            for(int i=0;i<repeat;i++)
            {
                buf.append(str);
            }
            repeat=0;//reset the value for the next input
        }
        else if(c==']')
        {
            break;
        }
        pos++;
    }
    return buf.toString();



    }
}
