class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = -x;
        }
        
        String str = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(str).reverse();
        
        try {
            x = Integer.parseInt(reversed.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        
        if (negative) {
            x = -x;
        }
        return x;
    }
}