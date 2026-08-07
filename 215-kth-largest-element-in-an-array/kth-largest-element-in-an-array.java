class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left  < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        return nums[k - 1];
    }
}
// easy code for this problem:
//  Arrays.sort(nums);
// return nums[nums.length - k];