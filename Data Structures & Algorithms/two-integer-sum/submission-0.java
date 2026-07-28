class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int a;
        int b;
        for(int i = 0; i < nums.length; i++){
            a = nums[i];
            b = target - a;
            if(map.containsKey(b)){
                return new int[]{map.get(b), i};
            }
            map.put(a, i);
        }
        return null;
    }
}
