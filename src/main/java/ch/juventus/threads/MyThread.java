package ch.juventus.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello " + Thread.currentThread().getName());
    }
}
