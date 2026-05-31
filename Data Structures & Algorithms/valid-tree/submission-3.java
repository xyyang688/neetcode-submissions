class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visit = new HashSet<>();

    public boolean validTree(int n, int[][] edges) {
        if (edges.length > n-1){
            return false;
        }

        for (int j = 0; j<n; j++){
            map.put(j, new ArrayList<>());
        }

        for (int i = 0; i<edges.length; i++){
            int[] edge = edges[i];
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        if (!dfs(0, -1, visit, map)){
            return false;
        }

        return visit.size() == n;
    }

    private boolean dfs(int node, int parent, Set<Integer> visit, HashMap<Integer, List<Integer>> map){
        if (visit.contains(node)){
            return false;
        }

        visit.add(node);
        for (int nei: map.get(node)){
            if (nei == parent){
                continue;
            }
            if (!dfs(nei, node, visit, map)){
                return false;
            }
        }
        return true;
    }
}
