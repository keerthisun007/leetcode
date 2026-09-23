class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int k=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                k+=1;
            }
            else{
                k-=1;
            }
        }
        return k;
    }
}
// == → compare primitive values (int, char, boolean, etc.)
// .equals() → compare String/Object contents ("abc", "++X", etc.)