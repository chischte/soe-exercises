package ch.juventus.recursion;

public class Main {



    public static void main(String[] args){
        FibonacciIterative fibiterative = new FibonacciIterative();
        FibonacciRecursive fibirecursive = new FibonacciRecursive();

        long startTime = System.currentTimeMillis();
        System.out.print(fibiterative.fibi(20));
        long finishTime = System.currentTimeMillis();
        long timeElapsed = finishTime - startTime;
        System.out.print(" Iterative timeElapsed: ");
        System.out.print(timeElapsed);
        System.out.println(" [ms]");

        startTime = System.currentTimeMillis();
        System.out.print(fibirecursive.fibr(20));
        finishTime = System.currentTimeMillis();
        timeElapsed = finishTime - startTime;
        System.out.print(" Recursive timeElapsed: ");
        System.out.print(timeElapsed);
        System.out.println(" [ms]");

        Palindrome palindrome=new Palindrome();
        while(true) {
            palindrome.checkIfPalindrome();
        }


    }



}
