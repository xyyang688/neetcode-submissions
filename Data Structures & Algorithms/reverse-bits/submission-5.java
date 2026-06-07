class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for (int i = 31; i>=0; i--){
            int digit = n&1;
            res += digit<<i;
            n = n>>>1;
        }

        return res;
    }
}
