package ch.juventus.fibonacci;

public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        int fibonacciNumber = fibonacci.calcFiboNumber(2);
        System.out.println(fibonacciNumber);
    }
}
