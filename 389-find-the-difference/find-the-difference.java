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