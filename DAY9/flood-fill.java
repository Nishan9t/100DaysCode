// https://leetcode.com/problems/flood-fill/



class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean [][] vis=new boolean[image.length][image[0].length];
        int orgColor= image[sr][sc];
        ff(image,sr,sc,color,vis,orgColor);
        return image;
        
    }
    public static void ff(int [][] image,int sr,int sc,int color,boolean[][] vis,int orgColor)
    {
        if(sr<0||sc<0|| sc>=image[0].length || sr>=image.length|| vis[sr][sc]==true|| image[sr][sc]!=orgColor)
        {
            return;
        }
        if(!vis[sr][sc])
        {
            image[sr][sc]=color;
            vis[sr][sc]=true;
        }
        ff(image,sr-1,sc,color,vis,orgColor);
        ff(image,sr+1,sc,color,vis,orgColor);
        ff(image,sr,sc-1,color,vis,orgColor);
        ff(image,sr,sc+1,color,vis,orgColor);
    }
}

