class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i<s.length(); i++){
            int l = i;
            int r = i;
            while (l>=0 && r<s.length() && s.substring(l,l+1).equals(s.substring(r,r+1))){
                count ++;
                l--;
                r++;
            }
        }

        for (int i = 0; i<s.length(); i++){
            int l = i;
            int r = i+1;
            while (l>=0 && r<s.length() && s.substring(l,l+1).equals(s.substring(r,r+1))){
                count ++;
                l--;
                r++;
            }
        }

        return count;
    }
}
