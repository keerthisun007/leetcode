class Solution {
    public boolean isPowerOfThree(int n) {
      if(n<=0) return false;
        while(n%3==0){
            n/=3;
        }
     return n == 1;//understand the difference between return n==1 and return true..
    }}
    //The loop keeps dividing n by 3 while it is divisible by 3. If n finally becomes 1, it is a power of 3; otherwise, it isn't.