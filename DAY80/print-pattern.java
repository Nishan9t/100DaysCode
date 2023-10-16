//  https://practice.geeksforgeeks.org/problems/print-pattern3549/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Recursion&sortBy=submissions



class Solution{
    static List<Integer> pattern(int N){
        
        List<Integer> ans = new ArrayList<>();
        
        patt(N,N,ans);
        return ans;
    }
    
    static void patt(int i,int N,List<Integer> ans)
    {
        if(i<=0)
        {
            ans.add(i);
            return;
        }
        
        ans.add(i);
        patt(i-5,N,ans);
        ans.add(i);
    }
}
