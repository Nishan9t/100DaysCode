//  https://leetcode.com/problems/generate-parentheses/


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans =new ArrayList<>();
        backtrack("",0,0,ans,n);
        return ans;
        
    }
    public void backtrack(String s,int openN, int closeN, List<String> ans, int n)
    {
        if(openN==n && closeN==n)
        {
            ans.add(s);
        }
        //allowed to put close
        if(openN<n)
        {
            backtrack(s+"(",openN+1,closeN,ans,n);
        }
        if(closeN<openN)
        {
            backtrack(s+")",openN,closeN+1,ans,n);
        }
    }
}


