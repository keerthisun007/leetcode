class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // 1. Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // 2. Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // 3. Compare characters (ignoring case)
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true;
    }
}
/*
do not use replaceAll because it consumes lot of space..so better don't use replaceAll...
class Solution {
    public boolean isPalindrome(String s) {
      String original=s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","");
      String reversed="";
      for(int i=original.length()-1;i>=0;i--){
        reversed= reversed + original.charAt(i);
      }  
      if(reversed.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "").equals( original)){
        return true;
      }
      else{
        return false;
      }
    }
}
*/