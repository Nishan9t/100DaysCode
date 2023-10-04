// https://practice.geeksforgeeks.org/problems/number-of-unique-paths5339/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions


class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        int[][] graph= new int[a][b];
        
        for(int i=0;i<a;i++)
        {
            graph[i][0]=1;
        }
         for(int i=0;i<b;i++)
        {
            graph[0][i]=1;
        }
        
        
        for(int i=1;i<a;i++)
        {
            for(int j=1;j<b;j++)
            {
                graph[i][j]=graph[i-1][j]+graph[i][j-1];
            }
        }
        return graph[a-1][b-1];
    }
}
