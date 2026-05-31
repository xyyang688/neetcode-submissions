class Solution {
    List<Integer> countList = new ArrayList<>();
    public String encode(List<String> strs) {
        String single = new String("");   // how to instantiate a String
        for (String str: strs){
            single += str;
            countList.add(str.length());
        }
        return single;
    }

    public List<String> decode(String str) {
        int index = 0;
        List<String> list = new ArrayList<>();

        for(int len: countList){
            int end = index + len;
            list.add(str.substring(index, end));
            index += len;
        }


        return list;
    }
}
