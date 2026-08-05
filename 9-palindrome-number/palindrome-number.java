class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int reversed=0;
        while(x>0){
            int digit= x%10;
             reversed=reversed*10+digit ;
            x/=10;
        }
        if(a!=reversed || x<0){
            return false;
        }
        else{
        return true;
    }}
}