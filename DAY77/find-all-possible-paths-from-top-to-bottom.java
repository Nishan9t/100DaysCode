// https://practice.geeksforgeeks.org/problems/find-all-possible-paths-from-top-to-bottom/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Backtracking&sortBy=submissions



class Solution {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

//each list contains the path top left element to right bottom corner
        ArrayList<Integer> list = new ArrayList<>();
        
        solve(res , list, 0, 0,n ,m ,grid);
        return res;
    }
    
    
    static void solve(ArrayList<ArrayList<Integer>> res , ArrayList<Integer> list, int i, int j, int n,int m, int[][] grid)
    {
        if(i== n-1 && j==m-1)
        {
            list.add(grid[i][j]);
            res.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return ;
        }
        
        if(i==n || j==m )
        {
            return;
        }
        
        list.add(grid[i][j]);
        solve(res,list,i+1,j,n,m,grid);
        solve(res,list,i,j+1,n,m,grid);
        
        list.remove(list.size()-1);
        return;
    }
}
