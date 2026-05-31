class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num: nums){
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        for (int i = 0; i<k; i++){
            int currMax = 0;
            int currIndex = 0;

            for (int key: map.keySet()){
                if (map.get(key) > currMax){
                    currMax = map.get(key);
                    currIndex = key;
                }
            }
            list.add(currIndex);
            map.remove(currIndex);
        }

        int[] newArray = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            newArray[j] = list.get(j);
        }

        return newArray;
    }
}
