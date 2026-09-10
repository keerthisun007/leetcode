class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[]arr=new int[nums.length*2];
       for(int i=0;i<nums.length;i++){
        arr[i]=nums[i];
       }
       for(int i=0 ;i<nums.length;i++){
        arr[nums.length+i]=nums[nums.length-i-1];
       }
       return arr;
    }
}