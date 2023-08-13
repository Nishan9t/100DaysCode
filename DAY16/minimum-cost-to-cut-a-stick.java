// https://leetcode.com/problems/minimum-cost-to-cut-a-stick/




class Solution {
    private int minCost(int start, int end, int rodStart, int rodEnd, int[] cuts, int[][] dp){
        
        if(end<start){
            return 0;
        }
        if(dp[start][end] != -1){
            return dp[start][end];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            int cost = rodEnd-rodStart +
            minCost(start,i-1,rodStart,cuts[i],cuts,dp)+
            minCost(i+1,end,cuts[i],rodEnd,cuts,dp);
            
            ans = Math.min(cost,ans);
        }
        
        dp[start][end] = ans;
        return ans;
    }
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int m = cuts.length;
        int[][] dp = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return minCost(0,cuts.length-1,0,n,cuts,dp);
    }
}






