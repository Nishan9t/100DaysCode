// https://leetcode.com/problems/find-the-town-judge



class Solution {
    public int findJudge(int n, int[][] trust) {
       

  //who is being trusted by someone else
        int indegree[] = new int[n+1];
        //persons who trusting others
        int outdegree[] = new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            indegree[trust[i][1]]++;
            outdegree[trust[i][0]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==n-1 && outdegree[i]==0)
            {
                return i;
            }
            
        }
        return -1;
    }
}

