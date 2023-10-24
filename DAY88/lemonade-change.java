// https://leetcode.com/problems/lemonade-change/



class Solution {
    public boolean lemonadeChange(int[] bills) {
        int N = bills.length;
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i=0;i<N;i++)
        {
            //if we get bill of 5
            if(bills[i]==5)
            {
                five++;
                continue;
            }
            int bill = bills[i];
            //if we get bill of 10
            if(bill == 10)
            {
                //if there is no change of 5 
                //we cannot return change hence false;
                if(five ==0)
                {
                    return false;
                }
                //if we have change then we get a 10 bill and loose a 5 bill as a change
                ten++;
                five--;
            }
            //if we get bill of 20
            //we have to return 15 as (5+10)bills or (5+5+5)bills
            else{
                //checking for one 5 and one 10 bill
                //if we have the bills then we will give them to customer as a change
                if((five >=1 && ten>=1))
                {
                    five--;
                    ten--;
                }
                //checking for three five bills
                //if we have the bills then we will give them to customer as a change
                else if(five >=3)
                {
                    five-=3;
                }
                //if we don't have change
                else
                {
                    return false;
                }
                //if we have the change we should collect 20 bills
                twenty++;
            }
        }
        return true;

    }
}





