class Solution {
    public List<String> fizzBuzz(int n) {
       List ans=new ArrayList();
       for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            ans.add("FizzBuzz");
        }
     else if(i%3==0){
        ans.add("Fizz");
     }
     else if(i%5==0){
        ans.add("Buzz");
     }
     else{
        ans.add(String.valueOf(i));
     }
       }
       return ans;
    }
}
/*
ArrayList vs LinkedList:
We used ArrayList because it is faster and more memory-efficient when simply appending elements to the end of a list sequentially.
same program using array:
String[] ans = new String[n];
        
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Array index starts at 0, so we map number 'i' to index 'i - 1'
            if (i % 3 == 0 && i % 5 == 0) {
                ans[i - 1] = "FizzBuzz";
            } 
            else if (i % 3 == 0) {
                ans[i - 1] = "Fizz";
            } 
            else if (i % 5 == 0) {
                ans[i - 1] = "Buzz";
            } 
            else {
                ans[i - 1] = String.valueOf(i);
            }
        }
        
        return ans;
    }
    */