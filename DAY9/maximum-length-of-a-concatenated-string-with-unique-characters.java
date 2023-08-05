// https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/



class Solution {
    int max = 0;
    
    public int maxLength(List<String> arr) {
        calculate(0, "", arr);
        return max;
    }
    
    private void calculate(int index, String cur, List<String> arr) {
        if(wordContainsDuplicates(cur)) return;
        
        max = Math.max(max, cur.length());
        
        if(index >= arr.size()) return;
        
        for(int i = index; i < arr.size(); i++) {
            calculate(i + 1, cur + arr.get(i), arr); 
        }
        
    }
    
    private boolean wordContainsDuplicates(String s) {
        int[] alphabet = new int[26];
        
        for(char c : s.toCharArray()) {
            alphabet[c - 'a']++;
            
            if(alphabet[c - 'a'] > 1) return true;
        }
        
        return false;
    }
}