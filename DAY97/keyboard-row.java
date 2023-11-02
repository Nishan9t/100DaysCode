// https://leetcode.com/problems/keyboard-row



  class Solution {
      public String[] findWords(String[] words) {

          String one = "qwertyuiopQWERTYUIOP";
          String two = "asdfghjklASDFGHJKL";
          String three = "zxcvbnmZXCVBNM";
          List<String> list = new LinkedList<>();
          for(int i=0;i<words.length;i++){
              if(check(words[i],one) || check(words[i],two) || check(words[i],three)){
                  list.add(words[i]);
              }
          }
          String[] arr = new String[list.size()];
          //converting arraylist to array
          //using get() method
          for(int i=0;i<list.size();i++)
          {
              arr[i]=list.get(i);
          }
          return arr;
      }
      public boolean check(String s, String checker)
      {
          boolean temp=true;
          for(char c : s.toCharArray())
          {
             if(checker.indexOf(c)==-1)
             {
                 return false;
             }
          }
          return temp;
      }
  }
