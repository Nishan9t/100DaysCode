// https://leetcode.com/problems/partition-labels/


class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        int lastOccur[] = new int[26];
        for(int i=0 ;i<n;i++)
        {
            lastOccur[s.charAt(i) - 'a']=i;
        }
        List<Integer> l=new ArrayList<>();
        int lastIdx = 0,i=0,max=0;
        while(i<n){
            //to get the reach of first index of possible substring
            max = Math.max(lastOccur[s.charAt(i)-'a'],max);
            //if we don't get any bigger max till max==i, we will increase i in string s
            while(i<n && max!=i)
            {
                max = Math.max(lastOccur[s.charAt(i)-'a'],max);
                i++;
            }
            //whenever we found that max of first character is equal to i
            //it means the it is last point till which that particular substring lasts

            l.add(max-lastIdx+1); // to provide length of substring
            lastIdx=max+1; //to start next substring from next chat
            i=max+1;  //increase the index in string
        }
        
        return l;
    }
}

