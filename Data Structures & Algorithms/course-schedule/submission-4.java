class Solution {
    HashMap<Integer, List<Integer>> premap = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (int i = 0; i < numCourses; i++){
            premap.put(i, new ArrayList<>());
        }

        for (int j = 0; j<prerequisites.length; j++){
            // correction
            premap.get(prerequisites[j][0]).add(prerequisites[j][1]);
        }

        for (int k = 0; k<premap.size(); k++){
            if (!helper(k)){
                return false;
            }
        }

        return true;
    }

    private boolean helper(int c){
        if (visited.contains(c)){
            return false;
        }

        if (premap.get(c).isEmpty()){
            return true;
        }

        visited.add(c);
        for (int cc: premap.get(c)){
            if (!helper(cc)){
                return false;
            }
        }
        visited.remove(c);
        premap.put(c, new ArrayList<>());

        return true;
    }
}
