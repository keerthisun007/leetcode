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
            return right;
        }
        return 0;
    }
}

/*

class Solution {
    public int mySqrt(int x) {
        for (int i = 0; i <= x; i++) {
            if ((long) i * i > x) {
                return i - 1;
            }
        }
        return x;
    }
}
*/