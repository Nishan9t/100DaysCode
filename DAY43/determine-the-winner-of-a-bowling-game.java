//   https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/


class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int i=1,j=i-1,k=i-2;
        int p1=player1[0],p2=player2[0];
        while(i<player1.length){
            if((j>=0 && player1[j]==10 ) || (k>=0 && player1[k]==10)){
                p1+=2*player1[i];
            }
            else{
                p1+=player1[i];
            }
            i++;
            j++;
            k++;
        }
        int l=1,m=l-1,n=l-2;
        while(l<player2.length){
            if((m>=0 && player2[m]==10 ) || (n>=0 && player2[n]==10)){
                p2+=2*player2[l];
            }
            else{
                p2+=player2[l];
            }
            l++;
            m++;
            n++;
        }
        if(p1>p2) return 1;
        else if(p1==p2) return 0;
        else return 2;
    }
}


