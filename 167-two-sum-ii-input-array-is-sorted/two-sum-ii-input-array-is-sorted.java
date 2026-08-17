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












    //    int[] k = new int[2];
//         for(int i=0;i<numbers.length;i++){
//         for(int j=i+1;j<numbers.length;j++){
//             if(numbers[i]+numbers[j]==target){
//        k[0]=i+1;
//        k[1]=j+1; }
//         }
//     }
//     return k;