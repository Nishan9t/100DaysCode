//  https://practice.geeksforgeeks.org/problems/print-all-possible-strings/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions




class GfG
{
    ArrayList<String> spaceString(String str)
    {
        ArrayList<String> ans = new ArrayList<>();

       helper( str,  0,ans,"");

       return ans;
    }
    
    public static void helper(String str,int i,ArrayList<String> list,String temp)
      {
            if(i==str.length()-1){

                temp += str.charAt(i) ;

                list.add(temp);

                temp ="";

                return;

            }

        helper(str,i+1,list,temp+str.charAt(i)) ;
        helper(str,i+1,list,temp+str.charAt(i)+" ") ;

        }
}
