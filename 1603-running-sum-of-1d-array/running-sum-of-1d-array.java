class Solution {
    public int[] runningSum(int[] nums) {
       for(int i=1;i<nums.length;i++){
        nums[i]=nums[i] + nums[i-1];
       }
       return nums;
    }}

    /*
    Start from i = 1 because nums[0] is already the first running sum, then add each number to the previous running sum.
nums[i] = nums[i] + nums[i-1] updates the array with the cumulative sum and finally returns it.

nums[i] = nums[i] + nums[i-1] adds the current number to the previous running sum; importantly, nums[i-1] has already been changed in the previous loop, so it contains the updated sum (e.g., nums[1] changes from 2 to 3).
Thus each step uses the new value stored at the previous index to build the next sum: [1,2,3,4] → [1,3,6,10]

*/