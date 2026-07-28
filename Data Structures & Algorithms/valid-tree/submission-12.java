class Solution {
    public boolean validTree(int n, int[][] edges) {
        int l = edges.length;
        if(l == 0){
            return true;
        }
        Set<Integer> list = new HashSet<>();
        list.add(0);
        int size = 1;
        int s;
        Arrays.sort(edges, Comparator.comparingInt(row -> row[0]));
        for(int i = 0; i < l; i++){
            list.add(edges[i][0]);
            list.add(edges[i][1]);
            s = list.size();
            if(s - size != 1){
                return false;
            } else {
                size = s;
            }
            
        }
        return true;
    }
}
