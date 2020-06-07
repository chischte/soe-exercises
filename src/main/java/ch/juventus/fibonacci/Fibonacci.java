package ch.juventus.fibonacci;

public class Fibonacci {

    private int fibonacciSum = 666;

    public int calcFiboNumber(int n) {

        if (n < 2) {
            return n;
        } else {
            return calcFiboNumber(n - 2) + calcFiboNumber(n - 1);
        }
    }

}
