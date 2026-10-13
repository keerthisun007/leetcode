
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<nums.length - 2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(ans);
    }}

    /*
    1. Set<List<Integer>> ans = new HashSet<>(); → Creates a Set to store triplets and avoid duplicate lists.
2. ans.add(Arrays.asList(nums[i], nums[left], nums[right])); → Groups the three numbers into a List and adds that triplet to the Set.
3. return new ArrayList<>(ans); → Converts the Set into a List because the method must return a List of triplets.

*/