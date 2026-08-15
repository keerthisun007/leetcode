class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] keerthi = new int[nums.length];

        // LEFT PRODUCTS
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            keerthi[i] = product;
            product = product * nums[i];
        }

        // RIGHT PRODUCTS
        product = 1;
 
        for (int i = nums.length - 1; i >= 0; i--) {
            keerthi[i] = keerthi[i] * product;
            product = product * nums[i];
        }

        return keerthi;
    }
}