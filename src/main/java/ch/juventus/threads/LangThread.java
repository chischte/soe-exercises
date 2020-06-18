package ch.juventus.threads;

public class LangThread extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("Hello " + java.lang.Thread.currentThread().getName());
    }
}
