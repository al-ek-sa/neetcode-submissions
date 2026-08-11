class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < heights.length - 1; i++){
            if(heights[i] != 0){
                count = result / heights[i];
                while(count < heights.length){
                    result = Math.max(result, (count-i)*Math.min(heights[i], heights[count]));
                    count ++;
                }
            }
        }
        return result;
    }
}
