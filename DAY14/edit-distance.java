//  https://leetcode.com/problems/edit-distance/




class Solution {
    public int minDistance(String word1, String word2) {
        // there are three operation
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return minDistance(0,0,word1,word2,dp);
    }
    
    public int minDistance(int ind1,int ind2,String word1,String word2,int[][] dp){
          
        if(ind1 > word1.length() - 1){
            //think i1 went to end but there is still i2 left then we have to make operation like insertion
            return word2.length() - ind2;
        }
        
        if(ind2 > word2.length() - 1){
            //think i2 went to end but there is still i1 left then we have to make operation like deletion
            return word1.length() - ind1;
        }
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        //we have to make word1 to word2 
        //if it is already matching
        if(word1.charAt(ind1) == word2.charAt(ind2) ){
             return dp[ind1][ind2] = minDistance(ind1+1,ind2+1,word1,word2,dp);
        }else{
            //if we are deleting some element
             int a = 1 + minDistance(ind1+1,ind2,word1,word2,dp);
        
             //if we are rplacing the element 
             int b = 1 + minDistance(ind1+1,ind2+1,word1,word2,dp);
        
             //if we are inserting the element 
             int c = 1 +minDistance(ind1,ind2+1,word1,word2,dp);
            
            
            return dp[ind1][ind2] = Math.min(a,Math.min(b,c));
        }
        
    }
}

