class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        String num;
        int res = 0;
        for(int i = 0; i <= n; i++){
            res = 0;
            num = Integer.toBinaryString(i);
            for(int j = 0; j < num.length(); j++){
                if(num.charAt(j) == '1') {
                    res ++;
                }
            }
            result[i] = res;
        }
        return result;
    }
}
