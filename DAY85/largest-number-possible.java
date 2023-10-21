//  https://practice.geeksforgeeks.org/problems/largest-number-possible5028/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Greedy&sortBy=submissions



class Solution{
    static String findLargest(int N, int S){

        if(S==0)
        {
            return (N==1)?"0":"-1";
        }
        //if sum cannot be found with N numbers
        if(S>9*N)
        {
            return "-1";
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++)
        {
            if(S>=9)
            {
                sb.append('9');
                S-=9;
            }
            else{
                sb.append(S);
                S=0;
            }
        }
        return sb.toString();
    }
}
