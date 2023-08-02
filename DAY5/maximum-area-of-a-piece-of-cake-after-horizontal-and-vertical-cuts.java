// https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/description/



class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);

        Arrays.sort(verticalCuts);

        long hormx=horizontalCuts[0];

        long vermx=verticalCuts[0];

//gap between 
        for(int i=0;i<horizontalCuts.length-1;i++)
        {
            hormx=Math.max(hormx, horizontalCuts[i+1]-horizontalCuts[i]);
        }

//gap between
        for(int i=0;i<verticalCuts.length-1;i++)
        {
            vermx=Math.max(vermx,verticalCuts[i+1]-verticalCuts[i]);
        }
        hormx=Math.max(hormx,h-horizontalCuts[horizontalCuts.length-1]);

        vermx=Math.max(vermx,w-verticalCuts[verticalCuts.length-1]);

        return (int)((hormx* vermx)% (long)(Math.pow(10,9)+7));

    }
}




