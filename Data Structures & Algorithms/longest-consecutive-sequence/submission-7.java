class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int num: nums){
            hashset.add(num);
        }

        int longest = 0;
        

        for (int n: hashset){
            if (!hashset.contains(n-1)){
                int length = 1;
                while (hashset.contains(n+length)){
                    length ++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
