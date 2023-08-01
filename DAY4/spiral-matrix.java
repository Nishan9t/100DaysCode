//   https://leetcode.com/problems/spiral-matrix/



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        List<Integer> li=new ArrayList<>();
        while(top <=bottom && left<=right)
        {
        
                //right
                for(int i=left;i<=right;i++)
                {
                    li.add(matrix[top][i]);
                }
                top++;
                //top to bottom
                for(int i=top;i<=bottom;i++)
                {
                    li.add(matrix[i][right]);
                }
                right--;
                //right to left at bottom
             if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                  {
                li.add(matrix[bottom][i]);
                 }
                 bottom--;
            }
                //bottom to top at left
            if(left<=right)
               {
                     for(int i=bottom;i>=top;i--)
                    {
                    li.add(matrix[i][left]);
                 }
                left++;}
        }
        return li;
    }
}
