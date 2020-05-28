package ch.juventus.recursion;

public class FibonacciIterative {

    public static long fibi(int n) {
        long fib = 0;
        long prev = 1;
        for (int i = 0; i < n; i++) {
            long temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
}
