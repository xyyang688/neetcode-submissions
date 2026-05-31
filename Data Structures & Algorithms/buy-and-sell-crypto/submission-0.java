class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int k = 1; k <= prices.length; k++){
            for (int i = 0; i< prices.length; i++){
                if (i+k <= prices.length){
                    int current = prices[i+k-1] - prices[i];
                    max = Math.max(max, current);
                }
            }
        }

        return max;
    }
}
