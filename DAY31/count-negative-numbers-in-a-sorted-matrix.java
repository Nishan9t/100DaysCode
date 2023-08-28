//   https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix


class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        int row=0;
        int col=grid[0].length-1;
       while(col>=0 && row <grid.length)
       {
            if(grid[row][col] <0)
            {
                //it means all the values down in the column are negative hence count += grid.length-currentrow
                count +=grid.length-row;
                //change the column
                col--;
             }
                //else come down in row
            else{
                row++;
            }
       }
       return count;
        
    }
}


