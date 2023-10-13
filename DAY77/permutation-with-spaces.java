// https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Backtracking&sortBy=submissions


class Solution{
    
    ArrayList<String> permutation(String S){
        ArrayList<String> list  =new ArrayList<>();
        
        backtrack(list , S, 0,"");
        Collections.sort(list);
        return list;
    }
    
    void backtrack(ArrayList<String> list , String s , int indx, String S)
    {
        if(indx == s.length())
        {
            if(S.charAt(S.length()-1) !=' ')
            {
                list.add(S);
            }
            return;
        }
        
        backtrack(list,s,indx+1,S+s.charAt(indx)+" ");
        backtrack(list,s,indx+1,S+s.charAt(indx));
    }
    
}


