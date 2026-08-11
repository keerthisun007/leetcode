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