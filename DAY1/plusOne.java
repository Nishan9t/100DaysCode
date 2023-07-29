// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int count=0;
        int[] ans;
        for(int i=0;i<len;i++)
        {
            if(digits[i]==9)
            {
                count++;
            }
        }
        if(count==len)
        {
            ans=new int[len+1];
            ans[0]=1;
            for(int i=1;i<len+1;i++)
            {
                ans[i]=0;
            }
        }
        else{
            ans=new int[len];
            boolean flag=false;
            for(int i=len-1;i>=0;i--)
            {
                if(digits[i]==9&& i==len-1)
                {
                    ans[i]=0;
                    flag=true;
                }
                else if(digits[i]==9&& flag)
                {
                    ans[i]=0;
                
                }
                else if(digits[i]!=9 && flag){
                    ans[i]=digits[i]+1;
                    flag=false;
                }
                else if(i==len-1){
                    ans[i]=digits[i]+1;
                }
                else{
                    ans[i]=digits[i];
                }
            }
        }
        return ans;
        
    }
}
