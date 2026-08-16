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