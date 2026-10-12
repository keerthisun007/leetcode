class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
        if(n % (i + 1) == 0){
            sum+=nums[i]*nums[i];
        }
        }
        return sum;
    }
}
/*
n is the array length, and i is the 0-based index, so i + 1 gives the 1-based index required by the problem.



n % (i + 1) == 0 checks whether the array length is perfectly divisible by that index; if true, the element is special.



sum += nums[i] * nums[i] adds the square of each special element to sum
*/