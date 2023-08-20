//   https://leetcode.com/problems/integer-break



class Solution {
    public int integerBreak(int n) {
// n = 1 => we get max value only when we divide 1 into 0 and 1
// n = 2 => we get max value only when we divide 2 into 1 and 1
// n = 3 => we get max value only when we divide 3 into 1 and 2
// n = 4 => we get max value only when we divide 4 into 2 and 2
// n = 5 => we get max value only when we divide 5 into 2 and 3
// n = 6 => we get max value only when we divide 6 into 3 and 3
// n = 7 => we get max value only when we divide 7 into 4 and 3
// n = 8 => we get max value only when we divide 8 into 2, 3 and 3
// n = 9 => we get max value only when we divide 9 into 3, 3 and 3
// n = 10 => we get max value only when we divide 10 into 4, 3 and 3
// From here we can see that upto n=7 we have different values but after n=7 we can just multiply 3 to n-3 to get the max value.
         if (n == 2 || n == 3) return n-1;
        int result = 1;
        while (n>4){
            n -= 3;
            result *= 3;
        }
        return (n*result);
    }
}