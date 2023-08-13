// https://leetcode.com/problems/super-egg-drop




//TLE
class Solution {

    //base case
    // f=0=>0
    //f=1=>1
    //e=0=>nothing
    //e=1=>f
    public int superEggDrop(int k, int n) {
        
        int[][] dp=new int[k+1][n+1];
        for(int e=1;e<=k;e++)
        {
            for(int f=1;f<=n;f++)
            {
                if(e==1)
                {
                    dp[e][f]=f;
                }
                else if(f==1)
                {
                    dp[e][f]=1;
                }
                else{
                    int min=Integer.MAX_VALUE;
                    for(int mj=f-1,pj=0;mj>=0;mj--,pj++)
                    {
                        int val1=dp[e][mj]; //egg survives
                        int val2=dp[e-1][pj];//egg breaks
                        int val=Math.max(val1,val2);
                        min=Math.min(val,min);
                    }
                    dp[e][f]=min+1;
                }
            }
        }
        return dp[k][n];
    }
}



//optimized


class Solution {
    Integer dp[][]=new Integer[101][10001];
    //Declared wrapper class because no need to initialise values, will be null defaultly
    
    public int superEggDrop(int K, int N) {
      
        if(K==1)//when there is only one egg
            return N;
        
        if(N==0 || N==1)//when no. of floors are 0 or 1
            return N;
        
        if(dp[K][N]!=null)//checking if it is filled
            return dp[K][N];
        
        int i,l=1,h=N;
        int ans=Integer.MAX_VALUE;
        while(l<=h)
        {
            int mid=(l+h)/2;
            
            int down_temp=superEggDrop(K-1,mid-1);//If egg breaks go down
            
            int up_temp=superEggDrop(K,N-mid);//if egg doesn't break go up
            
            int temp=1+Math.max(down_temp,up_temp);
            //adding one because we have used 1 attempt and max of up and down because
            //we need worst case attempts from both
            
            if(down_temp<up_temp)//if down attempts are less we only require upper ones and vise versa
                l=mid+1;
            else 
                h=mid-1;
            
            ans=Math.min(temp,ans);//this is beacuse we need minimum of all worst case attempts 
        }
        return dp[K][N]=ans;
    }
}







