class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
/*
count stores how many times each letter appears: add +1 for characters in s and -1 for characters in t; if all counts become 0, they are anagrams. ✅
charAt(i) - 'a' converts a letter into an array index (a→0, b→1, ..., z→25) so we know which letter’s count to update.
*/