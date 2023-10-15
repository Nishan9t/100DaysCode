//https://leetcode.com/problems/word-search




class Solution {
    boolean exists = false;
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    helper(board,i,j,word,"");
                    if(exists==true)
                    {
                        return true;
                    }
                }
            }
        }
        return exists;

        
    }

    public void helper(char[][] board , int i, int j, String word ,String newWord)
    {
        if(newWord.equals(word))
        {
            exists =true;
            return ;
        }
        int len = newWord.length();
        if(i<0 || i==board.length || j<0 || j==board[0].length || (len < word.length() && word.charAt(len)!= board[i][j]) || board[i][j] == '#')
        {
            return;
        }
        newWord +=board[i][j];
        board[i][j]='#';
        helper(board,i+1,j,word,newWord);
        helper(board,i-1,j,word,newWord);
        helper(board,i,j+1,word,newWord);
        helper(board,i,j-1,word,newWord);
        board[i][j] = newWord.charAt(newWord.length()-1);
    }
}
