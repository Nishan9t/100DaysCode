// https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions

class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length==0)
        {
            return 0;
        }
        
        int numIslands = 0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == '1')
                {
                    numIslands++;
                    dfs(grid , i ,j);
                }
            }
        }
        
        return numIslands;
    }
    
    private void dfs(char[][] grid , int i, int j)
    {
        if(i<0 || i >=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0')
        {
            return ;
        }
        grid[i][j] = '0'; // mark the current land as visited
        
 //now we check for all 1's near it and make then 0 as visited beacuse they are farming island
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j-1);
        dfs(grid, i +1, j+1);
        dfs(grid, i - 1, j+1);
        dfs(grid, i + 1, j-1);
    }
}

