class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int current = 0;
        for(int i = 0; i < 2; i++){
            for(int num : nums){
                ans[current++] = num;
            }
        }
        return ans;
    }
}