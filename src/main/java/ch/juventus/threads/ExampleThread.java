package ch.juventus.threads;

public class ExampleThread extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("Hello " + java.lang.Thread.currentThread().getName());
    }
}
