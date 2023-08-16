//   https://leetcode.com/problems/zigzag-conversion/




class Solution {
    public String convert(String s, int nums) {
      
      String[] ans=new String[nums];
      Arrays.fill(ans,"");
      if(nums ==1)
      {
          return s;
      }
       char[] array = s.toCharArray();  
      boolean flag=false;
      int i=0;
      
      for(int k=0;k<array.length;k++)
      {
          char ch=array[k];
          ans[i]+=ch;
          if(i==0||i==nums-1)
          {
              flag=!flag;
          }
          if(flag)
          {
              i+=1;
          }
          else{
              i-=1;
          }
      }
      String zigzag="";
      for(int j=0;j<nums;j++)
      {
          zigzag+=ans[j];
      }
      return zigzag;
    }
}
