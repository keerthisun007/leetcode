class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 97]++;
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
Check Length: If the two words do not have the same number of letters, they cannot be anagrams, so return false immediately.

Create 26 Buckets: An array of size 26 acts as a set of counters for every lowercase English letter from a to z, all initialized to 0.

Convert Letters to Indices (-'a'): Subtracting the character 'a' converts each letter into an array index from 0 to 25 (e.g., 'a' becomes 0, 'b' becomes 1, and 'z' becomes 25).

Track Frequencies: Loop through both words simultaneously. Add 1 to the corresponding bucket for each letter in the first word s, and subtract 1 for each letter in the second word t.

Verify the Balance: Check all 26 buckets. If both words have identical characters with identical counts, every bucket will equal 0 and the function returns true; otherwise, it returns false.
*/