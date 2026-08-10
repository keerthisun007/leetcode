class Solution {
    public char findTheDifference(String s, String t) {
        char keerthi=0;
        for(int i=0;i<s.length();i++){
            keerthi^=s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++) {
    keerthi^= t.charAt(i);
}
return keerthi;
    }
}
/*
First loop: Take all characters from s and store them in ans using XOR; second loop: take all characters from t and XOR them with the same ans.
Since the same characters occur in both strings, they cancel each other, leaving only the one extra character in t as the answer.

XOR rule: A ^ A = 0, A ^ 0 = A — so duplicate values cancel each other.
Use XOR when: answer = a ^ b ^ a → b remains; useful when every element appears twice except one.

*/