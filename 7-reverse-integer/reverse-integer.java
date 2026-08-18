class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
             int a=x%10;
            x=x/10;
            rev=rev*10+a;
        }
if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return(int) rev;
} 
    }
/* The while loop extracts the last digit of x using % 10 and builds the reversed number in rev .

A long data type is used so the number can safely grow without overflowing during the loop .

The if condition returns 0 if the result exceeds 32-bit integer limits, otherwise it returns rev as an int .

*/