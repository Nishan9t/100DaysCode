// https://leetcode.com/problems/burst-balloons/




class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        List<Integer> a=new ArrayList<>();
        a.add(1);//adding 1 at starting of arraylist for a[-1]=1 make easy to multiply
        for(int i=0;i<n;i++)
        {
            a.add(nums[i]);//adding all numbers
        }
        a.add(1);//adding 1 at last to make multiiplication easy
        
        int dp[][]=new int[n+1][n+1];
        for(int rows[]:dp)
        {
            Arrays.fill(rows,-1);
        }
        return f(1 , n, a, dp);
    }
    public int f(int i,int j,List<Integer> a, int dp[][])
    {
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int maxi=Integer.MIN_VALUE;
        for(int ind=i; ind<=j; ind++)
        {
            int cost =a.get(i-1)*a.get(ind)*a.get(j+1)+ f(i,ind-1,a,dp) + f(ind+1,j,a,dp);
            maxi=(int)Math.max(maxi,cost);
        }
        return dp[i][j]=maxi;
    }
}




