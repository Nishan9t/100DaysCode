// https://leetcode.com/problems/longest-common-prefix/



class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);// sort the arrray in lexicographic(alphabetical) order
        String s1 = strs[0]; //first string of sorted array
        String s2 = strs[strs.length-1]; //last string of sorted array
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
        
    }
}

