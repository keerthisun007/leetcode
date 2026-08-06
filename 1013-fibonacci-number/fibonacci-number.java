class Solution {
    public int fib(int n) {

        int first = 0;
        int second = 1;

        for(int i = 1; i <= n; i++){

            int third = first + second;

            first = second;
            second = third;
        }

        return first;
    }
}
// class Solution {
//     public int fib(int n) {
//        if (n == 0)
//             return 0;

//         if (n == 1)
//             return 1;
//         int a=0;
//         int b=1;
//         int c=0;
//         int i=1;
//         while(i<n){
//             c=a+b;
//             a=b;
//             b=c;
//             i++;
//         }
//         return b;
//     }
// }

/*
Question: Print Fibonacci Series → System.out.print(a + " ");
Question: Print nth Fibonacci Number → System.out.println(b);
*/