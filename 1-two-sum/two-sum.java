class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
/*
The outer loop picks each number nums[i], and the inner loop (starting at j = i+1) checks it against every number that comes after it, so no number pairs with itself or gets checked twice in reverse. If nums[i] + nums[j] == target, it immediately returns their indices {i, j} as the answer.
*/