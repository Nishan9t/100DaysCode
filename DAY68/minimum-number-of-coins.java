// https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions


class Solution{
    static List<Integer> minPartition(int N)
    {
        
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        List<Integer> ans =new ArrayList<>();
        
        int rem = N;
        for(int i=0; i<notes.length; i++)
        {
            while(rem >= notes[i])
            {
                rem -= notes[i];
                ans.add(notes[i]);
            }
            if(rem <= 0)
                break;
        }
        return ans;
    }
}

