// https://leetcode.com/problems/max-area-of-island/description/




class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int row=0; row<grid.length;row++)
        {
            for(int col = 0; col< grid[0].length;col++){
                if(grid[row][col]  == 1){
                    int area = islandArea(grid , row, col, 0);
                    if(area>maxArea)
                    {
                        maxArea=area;
                    }
                }
            }
        }
        return maxArea;
        
    }
    public int islandArea(int[][] grid, int row, int col, int area){
        if(row <0 || row >=grid.length || col <0 || col>=grid[0].length|| grid[row][col]==0)
        {
            return 0;
        }
        //to make the current cell visited so that it cannot be used again
        grid[row][col]=0;
        return 1+ islandArea(grid, row+1, col,area)+ islandArea(grid, row-1 , col, area) +
        islandArea(grid, row , col+1, area) +islandArea(grid, row , col-1, area);
    }
}

