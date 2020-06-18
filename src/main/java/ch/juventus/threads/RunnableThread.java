package ch.juventus.threads;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello " + java.lang.Thread.currentThread().getName());

    }

}
