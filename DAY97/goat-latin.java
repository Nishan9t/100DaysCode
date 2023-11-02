// https://leetcode.com/problems/goat-latin



class Solution {
public String toGoatLatin(String sentence) {
  StringBuilder goatLatin = new StringBuilder();
  String[] words = sentence.split(" ");
  String vowels ="aeiouAEIOU";
  for(int i=0;i<words.length;i++)
  {
      String word = words[i];
      char firstChar = word.charAt(0);
      if(vowels.indexOf(firstChar) != -1)
      {
          //append original word
          goatLatin.append(word);
      }
      else{
          //append word and firstChar at last
          goatLatin.append(word.substring(1)).append(firstChar);
      }
//append "ma" in last and also add i+1 times "a"
      goatLatin.append("ma").append("a".repeat(i+1));

        //if i not last word then append " "  so that there should be space between every words of sentence.
      if(i<words.length-1)
      {
          goatLatin.append(" ");
      }
  }
  return goatLatin.toString();

}

