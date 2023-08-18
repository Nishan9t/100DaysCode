//   https://leetcode.com/problems/substring-with-concatenation-of-all-words


class Solution {
   public static List<Integer> findSubstring(String S, String[] L) {
    List<Integer> res = new ArrayList<Integer>();
    if (S == null || L == null || L.length == 0) return res;
    int len = L[0].length(); // length of each word
    
    Map<String, Integer> map = new HashMap<String, Integer>(); // map for L
    for (String w : L) map.put(w, map.containsKey(w) ? map.get(w) + 1 : 1);
    
    //putting count of each word in words
    for (int i = 0; i <= S.length() - len * L.length; i++) {
       // putting all data count of words in words[] in copy every time i changes
        Map<String, Integer> copy = new HashMap<String, Integer>(map);
        for (int j = 0; j < L.length; j++) { 
            // check if match
            //taking the substring of word of len=words[0].length()
            String str = S.substring(i + j*len, i + j*len + len); 
            // next word
            if (copy.containsKey(str)) { 
                // is in remaining words
                int count = copy.get(str);
                if (count == 1) copy.remove(str);
                else copy.put(str, count - 1);
                if (copy.isEmpty()) {
                     // matches
                    res.add(i);
                    break;
                }
            } else break; // not in L
        }
    }
    return res;
}
}



