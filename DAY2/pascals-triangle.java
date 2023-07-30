// https://leetcode.com/problems/pascals-triangle/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        int [] [] dp=new int[numRows][numRows];
        for(int i=0; i<numRows; i++)
        {
            dp[i][0]=1;  //for starting element of each row
            dp[i][i]=1;  //for last element of each row
            for(int j=1; j<i; j++)
            {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<= i;j++)
            {
                row.add(dp[i][j]);
            }
            triangle.add(row);
        }
        return triangle;
        
    }
}

