 
class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        int[] reverse = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            reverse[i] = nums[nums.length - 1 - i];
        }

        return reverse[k - 1];
    }
}