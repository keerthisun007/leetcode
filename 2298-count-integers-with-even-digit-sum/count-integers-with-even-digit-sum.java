class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
        int sum=0;
            int temp=i;
            while(temp>0){
                int a=temp%10;
                sum+=a;
                temp/=10;
            }
            if(sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}