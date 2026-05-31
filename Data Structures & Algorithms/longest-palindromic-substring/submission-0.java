class Solution {
    public String longestPalindrome(String s) {
        int resLen = 0;
        int resL = 0;

        // odd length (ultimate resLen)
        for (int i = 0; i<s.length(); i++){
            int l = i;
            int r = i;
            while(l >= 0 && r<s.length() && s.substring(l, l+1).equals(s.substring(r, r+1))){
                if (resLen < r-l+1){
                    resLen = r-l+1;
                    resL = l;
                }
                l--;
                r++;
            }
        }

        // even length
        for (int i = 0; i<s.length(); i++){
            int l = i;
            int r = i+1;
            while(l >= 0 && r<s.length() && s.substring(l, l+1).equals(s.substring(r, r+1))){
                if (resLen < r-l+1){
                    resLen = r-l+1;
                    resL = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(resL, resL + resLen);
    }
}
