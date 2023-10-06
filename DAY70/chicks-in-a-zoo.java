// https://practice.geeksforgeeks.org/problems/chicks-in-a-zoo1159/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions




class Solution
{
    public long NoOfChicks(int N)
   {

        // Code here

        long[] newChik = new long[N+1];

        int cnt = 1;

        long total =1;

        newChik[0] = 1;

        while (cnt < N ){

            if (cnt >=6){

                total = total - newChik[cnt-6] ; // Take out the dead from total

            }

            newChik[cnt]= total*2; // Keep the new addition in a array

            total = total + (total*2); 

            cnt++;

        }

        return total;

    }
}

