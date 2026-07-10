class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> ans=new ArrayList<>();
       for(int i=1;i<=n;i++){
       if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } 
            // 2. Check divisibility by 3
            else if (i % 3 == 0) {
                ans.add("Fizz");
            } 
            // 3. Check divisibility by 5
            else if (i % 5 == 0) {
                ans.add("Buzz");
            } 
            // 4. If none match, add the number itself as a string
            else {
                ans.add(String.valueOf(i));
            }
       }
       return ans;
    }
}