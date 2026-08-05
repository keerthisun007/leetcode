class Solution {
    public boolean isPalindrome(int x) {
        int duplicate=x;
        int reversed=0;
        while(x>0){
            int digit= x%10;// Take last digit
             reversed=reversed*10+digit ; // Append the last number
            x/=10;// Remove last digit
        }
        if(duplicate !=reversed || x<0){
            return false;
        }
        else{
        return true;
    }}
}