class Solution {
    public int[] getConcatenation(int[] nums) {
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