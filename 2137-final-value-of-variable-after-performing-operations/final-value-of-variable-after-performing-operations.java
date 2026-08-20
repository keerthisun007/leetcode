class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String keerthi:operations){
            if(keerthi.equals("--X")|| keerthi.equals("X--")){
                x-=1;
            }
            else{
                x+=1;
            }
        }
        return x;
    }
}