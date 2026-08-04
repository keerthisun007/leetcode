class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int k:nums){
            result^=k;
        }
        return result;
    }
}
//If duplicate numbers should cancel out and only the unique number should remain, use XOR (^).

/*
check each element with the entire list
class Solution {
    public int singleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}
*/