class Solution {
    public void reverseString(char[] s) {
       char[] reversed = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            reversed[i] = s[s.length - 1 - i];
        }
      for(int i=0;i<s.length;i++){
        s[i]=reversed[i];
      }
    }
}
//you need to remember the length function and this logic reversed[i] = s[s.length - 1 - i];
