// https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Backtracking&sortBy=submissions






// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        
        ArrayList<String> res = new ArrayList<>();
        
        boolean vis[][]=new boolean[n][n];
        
        solveMaze(res,n,0,0,m,"",vis);
        
        return res;
        
    }
    
    public static void solveMaze(ArrayList<String> res , int n, int r, int c, int[][] m ,String path, boolean[][] vis)
    {
        if(r==n-1 && c ==n-1 && m[n-1][n-1]!=0)
        {
            res.add(path);
            return;
        }
        
        if(r>=0 && r<n && c>=0 && c<n && vis[r][c]!=true && m[r][c]!=0)
        {
            vis[r][c]=true;
            
            solveMaze(res,n,r+1,c,m,path+'D',vis);//Down
            solveMaze(res,n,r,c+1,m,path+'R',vis);//Right
            solveMaze(res,n,r-1,c,m,path+'U',vis);//Up
            solveMaze(res,n,r,c-1,m,path+'L',vis);//Left
            
            //backtrack
            vis[r][c]=false;
        }
    }
}


