class Solution {
    public int[] getConcatenation(int[] nums) {
    int[]keerthi=new int[nums.length+nums.length];
    for(int i=0;i<nums.length;i++){
        keerthi[i]=nums[i];
    }
    for(int i=0;i<nums.length;i++){
        keerthi[nums.length+i]=nums[i];
    }
    return keerthi;
    }}

        /*
        Create a new array twice the size of nums, then copy nums into the first half and again into the second half.
Finally, return the new array, so [1,2,3] becomes [1,2,3,1,2,3].

same code in arraylist then converted it into array then returning
List<Integer> keerthi = new ArrayList<>();
      for(int k:nums){
        keerthi.add(k);
      }
      keerthi.addAll(keerthi);
      int[]k=new int[keerthi.size()];
      for(int i=0;i<keerthi.size();i++){
        k[i]=keerthi.get(i);
      }
      return k;
    }}
    */