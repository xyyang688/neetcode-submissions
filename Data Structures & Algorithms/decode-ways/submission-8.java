class Solution {
    public int numDecodings(String s) {
        int dq = 0;
        int dq2 = 0;
        int dq1 = 1;

        for (int i = s.length()-1; i>=0; i--){
            if (s.charAt(i) == '0'){
                // the ways starting from the current position is 0; 
                // if dq1 = 0;
                // we are overwriting answers for the next position
                dq = 0;
            }
            else{
                // one digit exists
                dq = dq1;
                if (i+1 < s.length() && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i+1) < '7')){
                    // two-digit exists
                    dq += dq2;
                }
            }
            dq2 = dq1;
            dq1 = dq;
            dq = 0;
        }

        return dq1;
    }
}
