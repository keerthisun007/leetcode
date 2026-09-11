class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[count] = nums[i];
            count++;}
            return count;
    }
}
//i reads every element, and count marks where the next element not equal to val should be placed.If nums[i] == val, continue skips it; otherwise, we copy it to nums[count] and increase count.return count returns the number of valid elements, and LeetCode only checks the first count positions of the modified array.