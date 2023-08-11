//  https://leetcode.com/problems/word-break-ii/



class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<List<String>> dp = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordDict);
 
        for (int i = 0; i < s.length() + 1; i++) {
            dp.add(new ArrayList<>());
        }
        
        for(int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (wordSet.contains(s.substring(j, i))) {
                    if (j == 0) {
                        dp.get(i).add(s.substring(j, i));
                    } else if (dp.get(j).size() > 0) {
                        for (String sub : dp.get(j)) {
                            dp.get(i).add(sub + " " + s.substring(j, i));
                        }
                    }
                }
            }
        }
        return dp.get(s.length()); 
    }
}

 
