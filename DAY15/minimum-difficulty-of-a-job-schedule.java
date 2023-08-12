//  https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/



//It will give TLE

class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
       int n=jobDifficulty.length;
       if(n<d)
       {
           return -1;
       }
       return solve(jobDifficulty,n,0,d);
        
    }
    private int solve(int[] jobDifficulty,int n,int i,int d)
    {
        if(d==1)
        {
            int tempmax=Integer.MIN_VALUE;
            for(int j=i;j<n;j++)
            {
                if(jobDifficulty[j]>tempmax)
                {
                    tempmax=jobDifficulty[j];
                }
            }
            return tempmax;
        }

        int result=Integer.MAX_VALUE;
        int currD=Integer.MIN_VALUE;
        for(int j=i;j<=n-d;j++)
        {
            currD=Math.max(currD,jobDifficulty[j]);
            result=Math.min(result,currD+solve(jobDifficulty,n,j+1,d-1));
        }
        return result;
    } 
}



//optimized code



class Solution {
    //by limit of i and d
    int dp[][]=new int[301][11];
    public int minDifficulty(int[] jobDifficulty, int d) {
       int n=jobDifficulty.length;
       //put -1 in every cell of dp
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
       if(n<d)
       {
           return -1;
       }
       return solve(jobDifficulty,n,0,d);
        
    }
    private int solve(int[] jobDifficulty,int n,int i,int d)
    {
        if(d==1)
        {
            int tempmax=Integer.MIN_VALUE;
            for(int j=i;j<n;j++)
            {
                if(jobDifficulty[j]>tempmax)
                {
                    tempmax=jobDifficulty[j];
                }
            }
            return tempmax;
        }
        
        if(dp[i][d]!=-1)
        {
            return dp[i][d];
        }

        int result=Integer.MAX_VALUE;
        int currD=Integer.MIN_VALUE;
        for(int j=i;j<=n-d;j++)
        {
            currD=Math.max(currD,jobDifficulty[j]);
            result=Math.min(result,currD+solve(jobDifficulty,n,j+1,d-1));
        }
        dp[i][d]=result;
        return dp[i][d];
    } 
}


