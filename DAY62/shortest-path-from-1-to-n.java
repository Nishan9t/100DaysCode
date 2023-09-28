// https://practice.geeksforgeeks.org/problems/shortest-path-from-1-to-n0156/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Graph&sortBy=submissions


class Solution{
    static int minStep(int n){
               int step =0;
        while(n!=1)
        {
            if(n%3 == 0)
            {
                n = n/3;
                step++;
            }
            else{
                n--;
                step++;
            }
        }
        return step;
    }
}
