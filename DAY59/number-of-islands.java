// https://leetcode.com/problems/number-of-islands




class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j] == '1')
                {
                    count +=1;
                    call(grid,i,j);
                }
            }
        }
        return count;
    }
    public void call(char[][] grid , int i ,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0')
        {
            return ;
        }
        grid[i][j] ='0';
        call(grid,i-1,j);
        call(grid,i+1,j);
        call(grid,i,j-1);
        call(grid,i,j+1);
    }
}
