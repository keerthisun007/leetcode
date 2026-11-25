class Solution {
    public int[] shuffle(int[] nums, int n) {
       int arr[] = new int [nums.length/2];
       int keerthi[] = new int [nums.length];
       List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length/2;i++){
        arr[i]=nums[nums.length/2+i];
       }
       for(int i=0;i<nums.length/2;i++){
        list.add(nums[i]);
        list.add(arr[i]);
       }
       for(int i=0;i<nums.length;i++){
        keerthi[i]=list.get(i);
       }
       return keerthi;
    }}
    