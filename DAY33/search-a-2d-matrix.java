//   https://leetcode.com/problems/search-a-2d-matrix



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int rowPositionOfTarget=0;
        for(int i=0;i<rows;i++)
        {
            if(matrix[i][cols-1] >= target)
            {
                rowPositionOfTarget=i;
                break;
            }
        }
        int start=0;
        int end=cols-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(matrix[rowPositionOfTarget][mid]==target)
            {
                return true;
            }
            else if(matrix[rowPositionOfTarget][mid]>target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        
        return false;
    }
}
