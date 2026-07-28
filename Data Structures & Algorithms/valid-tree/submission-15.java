class Solution {
    public boolean validTree(int n, int[][] edges) {
        int l = edges.length;
        if(l == 0){
            return true;
        }
        Set<Integer> list = new HashSet<>();
        list.add(0);
        Arrays.sort(edges, Comparator.comparingInt(row -> row[0]));
        for(int i = 0; i < l; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            if(a == b){
                return false;
            }
            if (list.contains(a) && list.contains(b)){
                return false;
            } 
            if (!list.contains(a) && !list.contains(b)){
                return false;
            }
            list.add(a);
            list.add(b);
        }
        return true;
    }
}
