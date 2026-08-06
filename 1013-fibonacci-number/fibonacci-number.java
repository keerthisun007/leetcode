class Solution {
    public int fib(int n) {
       if (n == 0)
            return 0;

        if (n == 1)
            return 1;
        // int a=0;
        // int b=1;
        // int c=0;
        // int i=1;
        // while(i<n){
        //     c=a+b;
        //     a=b;
        //     b=c;
        //     i++;
        // }
        return fib(n-1)+fib(n-2);
    }
}

/*
Question: Print Fibonacci Series → System.out.print(a + " ");
Question: Print nth Fibonacci Number → System.out.println(b);
*/