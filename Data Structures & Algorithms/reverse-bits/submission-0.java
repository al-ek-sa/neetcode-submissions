class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        String reversed = new StringBuilder(binary).reverse().toString();
        return Integer.parseUnsignedInt(reversed, 2);
    }
}