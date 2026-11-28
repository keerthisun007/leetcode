class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = 0;
        while(left<=right){
             mid = (left+right) / 2;
            if((long)mid*mid < x){
                left = mid +1;
            }
            if((long) mid* mid > x){
                right = mid -1;
            }
            if( (long)mid * mid == x){
                return mid;
            }
        }
        if((long)mid * mid != x){
            return left -1;
        }
        return 0;
    }
}