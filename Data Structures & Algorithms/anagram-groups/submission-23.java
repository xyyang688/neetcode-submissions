class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str: strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sstrArray = new String(strArray);

            map.putIfAbsent(sstrArray, new ArrayList<>());
            map.get(sstrArray).add(str);
        }

        return new ArrayList<>(map.values());    // So Smartttt!!
    }
}
