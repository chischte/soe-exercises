package ch.juventus.threads;

public class Main {

    public static void main(String[] args) {

        java.lang.Thread a = new ExampleThread();
        java.lang.Thread b = new ExampleThread();
        java.lang.Thread c = new ExampleThread();
        java.lang.Thread d = new ExampleThread();
        java.lang.Thread e = new ExampleThread();
        java.lang.Thread f = new ExampleThread();
        java.lang.Thread g = new ExampleThread();
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();

    }
}
