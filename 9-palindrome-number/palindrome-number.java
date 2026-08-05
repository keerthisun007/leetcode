class Solution {
    public boolean isPalindrome(int x) {
        int duplicate=x;
        int reversed=0;
        while(x>0){
            int digit= x%10;// Take last digit
             reversed=reversed*10+digit ; // Append the last number
            x/=10;// Remove last digit
        }
        if(duplicate !=reversed || x<0 /* takes only the +ve number*/  ){
            return false;
        }
        else{
        return true;
    }}
}
/*
this is the main logic
while (number > 0)
{
    digit = number % 10;          // Take last digit
    reverse = reverse * 10 + digit; // Append to reverse
    number = number / 10;         // Remove last digit
}
*/