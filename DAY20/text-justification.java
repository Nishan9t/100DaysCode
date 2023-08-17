//   https://leetcode.com/problems/text-justification/





class Solution {
    void processLineWithOneWord(List<String> currLine,int currLen,int maxWidth,List<String> result){
        int spaces =maxWidth-currLen;
        String resStr=currLine.get(0);
        while(spaces>0)
        {
            resStr+=" ";
            spaces -=1;
        }
        result.add(resStr);
    }
    void processLineWithKWord(List<String> currLine,int currLen,int maxWidth,List<String> result){
        int spaces=maxWidth-currLen;
        int evenlySpaces = spaces/(currLine.size()-1); //if we have three words then we have 2 places to distribute spaces
        int unevenSpaces =spaces%(currLine.size()-1);
        int i=0;
        while(i<currLine.size()-1)
        {
            String str=currLine.get(i);
            int k=0;
            while(k<evenlySpaces)
            {
                str +=" ";
                k +=1;
            }
            currLine.set(i,str);
            i+=1;
        }
        i=0;
        while(unevenSpaces >0)
        {
            String str = currLine.get(i);
            str+=" ";
            currLine.set(i,str);
            i+=1;
            unevenSpaces--;
        }

    //combining with spaces

        String strRes="";
        for(i=0;i<currLine.size();i++)
        {
            if(i==0)
            {
                strRes +=currLine.get(i);
            }
            else{
                strRes +=" "+currLine.get(i);
            }
        }
        result.add(strRes);
    }
   void processLastLine(List<String> currLine,int currLen,int maxWidth,List<String> result) {
       int spaces=maxWidth-currLen;
         String strRes="";
        for(int i=0;i<currLine.size();i++)
        {
            if(i==0)
            {
                strRes +=currLine.get(i);
            }
            else{
                strRes +=" "+currLine.get(i);
            }
        }
        while(spaces >0)
        {
            strRes += " ";
            spaces--;
        }
        result.add(strRes);
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        
        List <String> result= new ArrayList<>();
        List<String> currLine=new ArrayList<>();
        currLine.add(words[0]);
        int currLen=words[0].length();
        for(int i=1;i<words.length;i++)
        {
            if((currLen + words[i].length()+1 )<=maxWidth)
            {
                currLine.add(words[i]);
                currLen+=words[i].length()+1;
            }
            else{
                if(currLine.size()==1)
                {
                    processLineWithOneWord(currLine,currLen,maxWidth,result);
                }
                else{
                    processLineWithKWord(currLine,currLen,maxWidth,result);
                }
                currLine = new ArrayList<>();
                currLine.add(words[i]);
                currLen= words[i].length();
            }
        }
        processLastLine(currLine,currLen,maxWidth,result);
        return result;
    }
}


