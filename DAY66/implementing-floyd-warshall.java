// https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions




class Solution
{
    public void shortest_distance(int[][] matrix)
    {
        int n = matrix.length;
        
        for(int k=0;k<n;k++)
        {
// Pick all vertices as source one by one
            for(int i=0;i<n;i++)
            {
// Pick all vertices as destination for the
                // above picked source

                for(int j=0;j<n;j++)
                {
			// If vertex k is on the shortest path
                    // from i to j, then update the value of
                    // dist[i][j]

                    if(matrix[i][k] != -1 && matrix[k][j] !=-1)
                    {
                        if(matrix[i][j] == -1)
                        {
                            matrix[i][j] = matrix[i][k] + matrix[k][j];
                        }
                        else
                        {
                            matrix[i][j] = Math.min(matrix[i][j] ,matrix[i][k] + matrix[k][j]);
                        }
                    }
                }
            }
        }
    }
}


