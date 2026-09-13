class Solution {
    public int lengthOfLastWord(String s) {
        String k=s.trim();
      int a=k.length();
      int count=0;
     for(int i=s.length()-1;i>=0;i--){
     if (s.charAt(i) == ' ') {
    if (count > 0) {
        break;
    }
    continue;
}

count++;}
return count;
    }
}