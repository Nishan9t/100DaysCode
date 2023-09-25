// https://leetcode.com/problems/rotting-oranges




class Solution {
    public int orangesRotting(int[][] grid) {
        int freshOranges = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] ==2){
                    q.add(new int[]{i,j}); //let's use an array to find where exactly are the rotting oranges
                } 
                //counting freshoranges
                if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }
          if(freshOranges ==0) return 0; //If there're no fresh Oranges, we don't need to do bfs
          int minutes =-1;  //start with -1 since minutes is 0-based in ths problem
        
          while(!q.isEmpty()){
            int size = q.size();
            minutes++; // add minutes at every level
            for(int i=0;i<size;i++){
                int[] orange = q.poll();
                int row = orange[0];
                int col = orange[1];
                if(row-1 >=0 && grid[row-1][col] ==1){ //check adjacent tiles for in bounds and has a fresh orange
                    q.add(new int[]{row-1,col});
                    grid[row-1][col] =2; //mark it now as rotting
                    freshOranges--;
                }
                if(row+1<grid.length && grid[row+1][col] ==1){
                    q.add(new int[]{row+1, col});
                     grid[row+1][col] =2;
                    freshOranges--;
                }
                if(col-1 >=0 && grid[row][col-1] ==1){
                    q.add(new int[]{row,col-1});
                     grid[row][col-1] =2;
                    freshOranges--;
                }
                if(col+1<grid[0].length && grid[row][col+1] ==1){
                    q.add(new int[]{row,col+1});
                     grid[row][col+1] =2;
                    freshOranges--;
                }
            }
        }
     return freshOranges==0? minutes :-1 ; //if there any fresh oranges remaining return -1 else return how long it took to get all of them
        
    }
   
}
