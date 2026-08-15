class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            left[i] = product;
            product = product * nums[i];
        }
            product = 1;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = product;
            product = product * nums[i];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
}
/*
First loop: Store the product of all numbers before i in left, and second loop stores the product of all numbers after i in right.
For each position, left[i] × right[i] gives the product of every number except the current number nums[i].
Example: [1,2,3,4] → left[2]=2, right[2]=4 → 2×4=8, so 3 is automatically skipped.
*/