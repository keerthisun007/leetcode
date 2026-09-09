class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}
//The code first returns `false` for non-positive numbers, since powers of four must be positive. It repeatedly divides `n` by `4`, and returns `true` only if the final value becomes `1`.
