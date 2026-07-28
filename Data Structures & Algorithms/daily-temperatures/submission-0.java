class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] result = new int[l];
        int t;
        int t1 = temperatures[1];
        int count = 0;
        for(int i = 0; i < l; i++){
            t = temperatures[i];
            t1 = 0;
            count = 0;
            while(t1 <= t && i+count < l){
                t1 = temperatures[i + count];
                count ++;
            }
            if(t1 <= t){
                result[i] = 0;
            } else {
                result[i] = count - 1;
            }
        }
        return result;
    }
}
