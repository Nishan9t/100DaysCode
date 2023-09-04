//   https://leetcode.com/problems/verifying-an-alien-dictionary




class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(!check(words[i],words[j],order))
                {
                    return false;
                }
            }
        }
        return true;
        
    }
    boolean check(String one , String two, String order)
    {
        for(int i=0;i<one.length() && i<two.length();i++)
        {
//whenever we got the charctcer of one smaller than two 
//it means one string is smaller than two and we don't have to check further characters 
            if(order.indexOf(one.charAt(i)) < order.indexOf(two.charAt(i)))
            {
                return true;
            }
            if(order.indexOf(one.charAt(i))>order.indexOf(two.charAt(i)))
            {
                // System.out.println(one.charAt(i));
                // System.out.println(two.charAt(i));
                return false;
            }
        }
        if(one.length()>two.length())
        {
            return false;
        }
        return true;
    }
}

//HASH TABLE METHOD



class Solution {
     public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<order.length(); i++){
            map.put(order.charAt(i), i);
        }
        for(int i = 0; i < words.length-1; i++){
            String w1 = words[i], w2 = words[i+1];
            for(int j = 0; j < w1.length(); j++){
                //if w1.length > w2.length
                if(j == w2.length())
                    return false;
                //if charcters are not same
                if(w1.charAt(j) != w2.charAt(j)){
                    
                    if(map.get(w1.charAt(j)) > map.get(w2.charAt(j)))
                        return false;
                    else
                        break;
                }
            }
        }
        return true;
    }
}

