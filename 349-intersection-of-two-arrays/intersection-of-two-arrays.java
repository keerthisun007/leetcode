class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1=new HashSet<>();
       Set<Integer> set2=new HashSet<>();
       for(int s:nums1){
        set1.add(s);
       }
       for(int s:nums2){
        set2.add(s);
       }

        set1.retainAll(set2);
        int[] arr = new int[set1.size()];

int i = 0;
for (int num : set1) {
    arr[i++] = num;
}
return arr;
    }
}
