class Solution {
    public int reverseBits(int n) {
        String a = Integer.toBinaryString(n);
        
        // Fix 1: Pad with leading zeros so length is always 32
        while (a.length() < 32) {
            a = "0" + a;
        }
        
        // Your logic: Reverse the string
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        
        // Fix 2: Parse as unsigned integer to prevent overflow
        return Integer.parseInt(b, 2);
    }
}
