// https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&category[]=Backtracking&sortBy=submissions




class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
       
        
        HashMap<Integer, List<Character>> map = new HashMap<>();
        map.put(2, Arrays.asList(new Character[]{'a', 'b', 'c'}));
        map.put(3, Arrays.asList(new Character[]{'d', 'e', 'f'}));
        map.put(4, Arrays.asList(new Character[]{'g', 'h', 'i'}));
        map.put(5, Arrays.asList(new Character[]{'j', 'k', 'l'}));
        map.put(6, Arrays.asList(new Character[]{'m', 'n', 'o'}));
        map.put(7, Arrays.asList(new Character[]{'p', 'q', 'r', 's'}));
        map.put(8, Arrays.asList(new Character[]{'t', 'u', 'v'}));
        map.put(9, Arrays.asList(new Character[]{'w', 'x', 'y', 'z'}));
        
        
        ArrayList<String> res = new ArrayList<>();
        
        helper(a,0,"",map,res);
        
        return res;
    }
    
    private static void helper(int a[],int i,String cur, HashMap<Integer, List<Character>> map, ArrayList<String> res)
    {
        if(i==a.length)
        {
            res.add(cur);
            return;
        }
        
        for(char c:map.get(a[i]))
        {
            helper(a,i+1,cur+c,map,res);
        }
    }
}
