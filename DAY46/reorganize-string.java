// https://leetcode.com/problems/reorganize-string/


class Pair {
    
    int count ;
    char val ;
    
    public Pair(int count , char val){
        this.count = count ;
        this.val = val ;
    }
}

class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a , b) -> (b.count - a.count));
        HashMap<Character , Integer> map = new HashMap() ;

        //storing chars with their frequency
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        //storing all Pairs in decreasing order of their count
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            pq.add(new Pair(entry.getValue(),entry.getKey()));
        }

        StringBuilder sb = new StringBuilder();
        Pair prev = null;

        while(!pq.isEmpty())
        {
            Pair cur = pq.poll();
            sb.append(cur.val);
            
            if(prev!=null)
            {
                pq.add(prev);
                prev=null;
            }
            int new_count = cur.count-1;
            if(new_count >0)
            {
                prev = new Pair(new_count,cur.val);
            //by adding prev in next loop makes the char to skip if it gets repeated 
            //by which sb.length() will not ne equal to s.length()
            }
        } 

        return (sb.length() == s.length())? sb.toString() : "";


    }
}