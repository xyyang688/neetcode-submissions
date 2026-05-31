class Solution {
    public boolean isPalindrome(String s) {
        int j = 0;
        int r = s.length()-1;

        while (j < r){
            while (j<r && !alphNum(s.charAt(j))){
                j++;
            }

            while (j<r && !alphNum(s.charAt(r))){
                r--;
            }

            // Character.toLowerCase(...)    +    s.charAt(j)
            if (Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }

            j++;
            r--;
        }
        
        return true;
    }    

    public boolean alphNum(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
