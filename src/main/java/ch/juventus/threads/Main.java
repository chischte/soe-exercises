package ch.juventus.threads;

public class Main {

    public static void main(String[] args) {

        java.lang.Thread a = new LangThread();
        java.lang.Thread b = new LangThread();
        java.lang.Thread c = new LangThread();
        a.start();
        b.start();
        c.start();

        // Thread x = new RunnableThread();
        // Runnable y = new RunnableThread();
        // Runnable z = new RunnableThread();
        // new Thread(x).start();
        // new Thread(y).start();
        // new Thread(z).start();
        // System.out.println(x.getState());


    }
}
