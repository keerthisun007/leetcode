class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 2 pointers approach
        Set <Character> keerthi = new HashSet<>();
        int maxlength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(keerthi.contains(s.charAt(right))){
                keerthi.remove(s.charAt(left));
                left++;
            }
            keerthi.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left + 1);
        } 
        return maxlength;
    }
}
/*
1. A HashSet stores unique characters, while left and right pointers maintain a sliding window without duplicates.
2. If s.charAt(right) already exists, remove characters from the left using remove() and increment left until the duplicate disappears.
3. Add the current character and update maxlength = Math.max(maxlength, right - left + 1) to return the longest substring length without repeating characters.
*/