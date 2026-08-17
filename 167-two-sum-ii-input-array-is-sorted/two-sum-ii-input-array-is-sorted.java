class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;  // Need a bigger sum
            } else {
                right--; // Need a smaller sum
            }
        }
        return new int[]{};
    }
}

//We place one pointer at the smallest number (start) and one at the largest (end) to add them together. 

// If their sum is too small, we move the start pointer forward to increase the total; if it is too big, we move the end pointer backward to decrease it until we find the exact target.










//    int[] k = new int[2];
//         for(int i=0;i<numbers.length;i++){
//         for(int j=i+1;j<numbers.length;j++){
//             if(numbers[i]+numbers[j]==target){
//        k[0]=i+1;
//        k[1]=j+1; }
//         }
//     }
//     return k;