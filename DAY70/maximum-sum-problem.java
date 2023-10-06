// https://practice.geeksforgeeks.org/problems/maximum-sum-problem2211/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions




class Solution {
    static int countNumberswith4(int N) {
        int count=0;
        
        
        for (int i = 1; i <= N; i++) {
            //till next value containing 4 count will be same
            //count changes whenever value with 4 comes
            if (contains(i)) { 
                count++;
                
            }
        }
 
        return count;
    }
    static boolean contains(int i) // boolean function to check
    { // whether i contains digit '4' or not
        while (i > 0) {
            if (i % 10 == 4)
                return true;
 
            i /= 10;
        }
        return false;
    }
};
