class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;

        if (s.length() == 0){
            return 0;
        }
        int max = 1;
        

        while (l<s.length()-1){
            int r = l+1;
            List<String> list = new ArrayList<>();
            int count = 1;
            list.add(s.substring(l,l+1));

            while (r<s.length() && !list.contains(s.substring(r,r+1))){
                list.add(s.substring(r,r+1));
                r++;
                count ++;
                
            }
            //System.out.println(count);
            max = Math.max(max, count);
            System.out.println(max);

            l++;
        }

        return max;
    }
}
