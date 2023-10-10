// https://practice.geeksforgeeks.org/problems/prime-number2314/1?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Algorithms&sortBy=submissions


class Solution{
    static int isPrime(int N){
        if(N==1){
            return 0;
        }
        if(N==2 || N==3){
            return 1;
        }
        if(N%2==0 || N%3==0){
            return 0;
        }
        //left numbers from which we can divide are
        //5  7     11    13 17     19     23 and so on...
        //i i+2  i+6    i  i+2   i+6
        
        for(int i=5;i<=Math.sqrt(N);i+=6){
            
            if(N%i==0 || (N)%(i+2)==0){
                return 0;
            }
        }
        return 1;
    }
}