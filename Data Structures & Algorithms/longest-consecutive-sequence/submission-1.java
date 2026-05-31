class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        
        Arrays.sort(nums);
        Set<Integer> hashset = Arrays.stream(nums)  // IntStream
                             .boxed()       // Stream<Integer>
                             .collect(Collectors.toSet());  // Set<Inte
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<nums.length; i++){
            int count = 1;
            
            if (!hashset.contains(nums[i]-1)){
                int next = nums[i]+1;
                while (hashset.contains(next)){
                    next++;
                    count ++;
                }
            }
            list.add(count);

        }

        return Collections.max(list);
    }
}
