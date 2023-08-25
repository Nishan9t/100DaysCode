//   https://leetcode.com/problems/minimum-number-of-taps-to-open-water-a-garden




class Solution {
    public int minTaps(int n, int[] ranges) {
//         Approach: We just have to find the tap with largest rightMax range && which should start atleast from our current minimum ranged reached. Now the current minimum point will be the rightMax range of previously selected tap.
// Hence if no tap is selected, previous minimum would be 0, so next tap should be selected as: left point zero or less than zero, but right should be max of all.
// Repeat untill we get rightMax >= time.
    int max=0;
    int min=0;
    int taps=0;
    while(max < n)
    {
        //finding the best fit max by  keeping min as constant
        for(int i=0;i<ranges.length;i++)
        {
            int left = i-ranges[i];
            int right =i+ranges[i];
            if(left <= min && right > max)
            {
                max= right;
            }
        }
        //now if there is a gap , then it is not possible to merge ranges of taps,
        //hence min == max indicates that we end up getting same max as previous hence not possible
        if(min == max) return -1;
        //now our max will be min
        min = max;
        taps++;
        //now we will find the next best fit tap
    }
    return taps;
        
    }
}

