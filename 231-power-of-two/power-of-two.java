class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}
//same code for all power of 3,power of 4