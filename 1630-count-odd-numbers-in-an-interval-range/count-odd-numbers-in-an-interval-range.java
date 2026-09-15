class Solution {
    public int countOdds(int low, int high) {
       int keerthi=low/2;
       int sasu=(high + 1)/2;
       return sasu - keerthi ;
    }
}
//(high + 1) / 2 counts odd numbers from 0 to high, while low / 2 counts the odd numbers before low. Subtracting them gives the number of odd numbers in the range [low, high]