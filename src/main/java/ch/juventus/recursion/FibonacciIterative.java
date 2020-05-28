package ch.juventus.recursion;

public class FibonacciIterative {

    public static int fibi(int n) {
        int fib = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
}
