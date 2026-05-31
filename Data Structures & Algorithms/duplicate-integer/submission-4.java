class Solution {
    public boolean hasDuplicate(int[] nums) {
        List list = new ArrayList<>();  //define a list like this
        for (int element: nums){
            if (list.contains(element)){
                return true;
            }
            else{list.add(element);}
        }
        return false;
    }
}