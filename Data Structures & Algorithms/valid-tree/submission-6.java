class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        Arrays.sort(edges, Comparator.comparingInt(row -> row[0]));

        for(int i = 0; i < edges.length; i++){
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
