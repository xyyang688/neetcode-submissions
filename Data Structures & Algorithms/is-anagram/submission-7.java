class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){    // !=
            return false;
        }
        else{
            Map<String, Integer> maps = new HashMap<>();
            Map<String, Integer> mapt = new HashMap<>();
            for (int i  = 0; i<s.length(); i++){
                if (!maps.containsKey(s.substring(i,i+1))){
                    maps.put(s.substring(i,i+1), 0);
                }
                else{
                    maps.put(s.substring(i,i+1), maps.get(s.substring(i,i+1))+1);
                }
            }

            for (int j  = 0; j<t.length(); j++){
                if (!mapt.containsKey(t.substring(j,j+1))){
                    mapt.put(t.substring(j,j+1), 0);
                }
                else{
                    mapt.put(t.substring(j,j+1), mapt.get(t.substring(j,j+1))+1);
                }
            }

            if (!maps.equals(mapt)){
                return false;
            }
        }
        return true;
    }
}
