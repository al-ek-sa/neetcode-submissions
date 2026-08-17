class KthLargest {
    List<Integer> list;
    int K;
    public KthLargest(int k, int[] nums) {
        this.list = new ArrayList<>();
        this.K = k;
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - K);
    }
}
