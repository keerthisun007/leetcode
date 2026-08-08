class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer>keerthi=new HashSet<>();
        for(int k:nums){
            if(!keerthi.add(k)){
                return true;
            }}
           return false;
    }}
//Loop through each number, try adding it to a HashSet, and return true immediately if the set rejects a number as already existing.