class Solution {
    public int reverseBits(int n) {
        String a = Integer.toBinaryString(n);
        
        //Integer.toBinaryString(n) munnadi irukkura zeros-a cut panradhaala, 32 bits-um reverse aagama thappana answer varudhu.

// Correct answer vara, reverse pandradhukku munnadi string length 32 aagura varaikkum front-la "0" add pannanum.
        while (a.length() < 32) {
            a = "0" + a;
        }
        
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        
        return Integer.parseInt(b, 2);
    }
}
