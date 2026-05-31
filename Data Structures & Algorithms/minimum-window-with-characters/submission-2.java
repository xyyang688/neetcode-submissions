class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        HashMap<String, Integer> mapt = new HashMap<>();
        int have = 0;
        // need is the number of distinct letter
        int need = mapt.size();
        HashMap<String, Integer> maps = new HashMap<>();
        int resLen = Integer.MAX_VALUE;
        int resLP = 0;

        for (int i = 0; i<t.length(); i++){
            // mapt.getOrDefault
            mapt.put(t.substring(i,i+1), mapt.getOrDefault(t.substring(i,i+1), 0)+1);
        }

        need = mapt.size();

        for (int r = 0; r<s.length(); r++){
            maps.put(s.substring(r,r+1), maps.getOrDefault(s.substring(r,r+1), 0)+1);

            if (mapt.containsKey(s.substring(r,r+1)) && maps.get(s.substring(r,r+1)) == mapt.get(s.substring(r,r+1))){
                have++;
            }

            while(have == need){
                // if condition to make sure resLen and l are only revised under certain circumstances
                if (resLen > r-l+1){
                    resLen = Math.min(resLen, r-l+1);
                    resLP = l;
                }

                // shrink left pointer
                String leftpointer = s.substring(l,l+1);
                maps.put(leftpointer, maps.get(leftpointer)-1);

                if (mapt.containsKey(leftpointer) && maps.get(leftpointer) < mapt.get(leftpointer)){
                    have--;
                }

                l++;
            }

        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(resLP, resLP+resLen);
    }
}
