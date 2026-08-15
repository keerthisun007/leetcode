class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        // Create LEFT array
        int product = 1;

        for (int i = 0; i < n; i++) {
            left[i] = product;
            product = product * nums[i];
        }

        // Create RIGHT array
        product = 1;

        for (int i = n - 1; i >= 0; i--) {
            right[i] = product;
            product = product * nums[i];
        }

        // Multiply LEFT × RIGHT
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }
}