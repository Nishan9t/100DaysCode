//   https://leetcode.com/problems/powx-n



class Solution {
    public double myPow(double x, int n) {
       
     //clone n to temp and create and initialize the ans
     long temp =n;
     double ans =1.0;
     //check if power is -ve
     if(temp <0)
     {
         temp *=-1;
     } 
     //now run a loop until temp become zero
     while(temp >0)
     {
         //for odd power keep updating ans and temp
         if(temp %2==1)
         {
             ans *=x;
             temp -=1;
         }
         //else if temp is even the update x and temp
         else{
             x *=x;
             temp /=2;
         }
     } 
     //for -ve power
     if(n<0)
     {
         ans =1.0/ans;
     }
     return ans;
     
    }
}
