class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str: strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sstrArray = new String(strArray);

            if (!map.containsKey(sstrArray)){
                List<String> innerString = new ArrayList<>();
                innerString.add(str);
                map.put(sstrArray, innerString);
            }
            else{
                List<String> newList = map.get(sstrArray);
                newList.add(str);
                map.put(sstrArray, newList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
