class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int a;
        int b;
        Integer val;
        for(int i = 0; i < nums.length; i++){
            a = nums[i];
            b = target - a;
            val = map.get(b);
            if(val != null){
                return new int[]{val, i};
            }
            map.put(a, i);
        }
        return null;
    }
}
