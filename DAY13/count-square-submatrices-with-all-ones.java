//  https://leetcode.com/problems/count-square-submatrices-with-all-ones/


class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                //starting row ans column will be same
                if(i==0 || j==0)
                {
                    dp[i][j]=matrix[i][j];
                }
                else if(matrix[i][j]==1)
                {
                    //take minimum of all above three connected cells 
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    
                }
                
                sum+=dp[i][j];
            }
        }
        return sum;
        
    }
}
