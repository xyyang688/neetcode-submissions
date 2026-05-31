class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // use goOrDefault to add num and counts
        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // use .add() + .sort((a, b) -> b-a)
        List<int[]> list = new ArrayList<>();
        for (int key: map.keySet()){
            list.add(new int[] {key, map.get(key)});
        }
        list.sort((a,b) -> b[1] - a[1]);

        int[] newArray = new int[k];
        for (int i = 0; i<k; i++){
            newArray[i] = list.get(i)[0];
        }

        return newArray;
    }
}
