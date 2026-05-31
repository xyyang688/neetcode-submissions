class Solution {
    private Map<Integer, Boolean> memo; //

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        memo = new HashMap<>();
        memo.put(n, true);

        return dfs(s, wordDict, 0);
    }

    private boolean dfs(String s, List<String> wordDict, int i){
        if (memo.containsKey(i)){
            return memo.get(i);
        }

        for (String w: wordDict){
            int l = w.length();
            if (i + l <= s.length() && s.substring(i, i+l).equals(w)){
                if (dfs(s, wordDict, i+l)){ //
                    memo.put(i, true);//
                    return true; //
                }
            }
        }

        memo.put(i, false);
        return false;
    }
}
