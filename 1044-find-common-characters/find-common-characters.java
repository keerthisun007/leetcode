class Solution {
    public List<String> commonChars(String[] words) {
 List<String> result = new ArrayList<>();
        int[] arr = new int[26];

        Arrays.fill(arr, Integer.MAX_VALUE);
            for(String word : words){
            int [] current = new int [26];
            char [] keer = word.toCharArray();
            for(char c: keer){
                current[c - 'a']++;
            }
        
        for(int i=0;i< 26;i++){
            arr[i]=Math.min(arr[i],current[i]);
        }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<arr[i];j++){
                result.add(String.valueOf((char)('a'+i)));
            }
        }
        return result;
    }
}
/*
current[c - 'a']++ counts each character in the current word, while arr stores the minimum frequency common to all words using Math.min().

The outer loop (i) checks all 26 letters, and the inner loop (j < arr[i]) adds each common character to result as many times as its frequency.

return result returns the common characters; for ["bella", "label", "roller"], the output is ["e", "l", "l"]
*/