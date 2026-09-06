class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
   int[]count=new int[26];
   for(int i=0;i<magazine.length();i++){
    count[magazine.charAt(i)-'a']++;
   }
   for(int i=0;i<ransomNote.length();i++){
    count[ransomNote.charAt(i)-'a']--;
    if(count[ransomNote.charAt(i)-'a']<0){return false;}
   }
   return true;
    }
}
/*
First, it counts and stores the frequency of every available letter from the magazine in a 26-slot array.

Next, it subtracts each letter needed for ransomNote, immediately returning false if any letter count drops below zero.
*/