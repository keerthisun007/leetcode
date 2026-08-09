class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
}





// class Solution {
//     public void reverseString(char[] s) {
//        char[] reversed = new char[s.length];
//         for (int i = 0; i < s.length; i++) {
//             reversed[i] = s[s.length - 1 - i];
//         }
//       for(int i=0;i<s.length;i++){
//         s[i]=reversed[i];
//       }
//     }
// }
//you need to remember the length function and this logic reversed[i] = s[s.length - 1 - i];
