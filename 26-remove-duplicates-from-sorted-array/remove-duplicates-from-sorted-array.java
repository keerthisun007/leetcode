class Solution {
    public int removeDuplicates(int[] nums) {
 Set<Integer> ar = new TreeSet<>();
 for(int k:nums){
    ar.add(k);        
    }
    int index = 0;

for (int value : ar) {
    nums[index++] = value;
}
return ar.size();
    }
}