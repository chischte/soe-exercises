package ch.juventus.recursion;

public class FibonacciRecursive {

    public static long fibr(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibr(n-2) + fibr(n-1);
        }
    }

}
