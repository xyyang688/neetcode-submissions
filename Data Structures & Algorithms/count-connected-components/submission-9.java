class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();

    public int countComponents(int n, int[][] edges) {
        boolean[] visit = new boolean[n];

        for (int j = 0; j<n; j++){
            map.put(j, new ArrayList<>());
        }

        for (int[] edge: edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        int count = 0;
        for (int i = 0; i<n; i++){
            if (!visit[i]){
                dfs(i, map, visit);
                count++;
            }
        }
        return count;
    }

    private void dfs(int i, HashMap<Integer, List<Integer>> map, boolean[] visit){
        visit[i] = true;

        for (int nei: map.get(i)){
            if(!visit[nei]){
                dfs(nei, map, visit);
            }
        }
    }
}
