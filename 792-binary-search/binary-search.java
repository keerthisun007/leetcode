class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
        int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
              right = mid -1;
            }
            if (nums[mid] == target) {
                return mid;
            }

        }
        return -1;
    }
}
/*
1. Compare with target, not indices: Use nums[mid] < target or nums[mid] > target.

2. Eliminate half, not one element: Use left = mid + 1 or right = mid - 1, not left++ or right--.

3. Update mid inside the loop: Use while (left <= right) to check every possible element, including the last one.

Remember: Compare → Eliminate Half → Recalculate Mid.
*/