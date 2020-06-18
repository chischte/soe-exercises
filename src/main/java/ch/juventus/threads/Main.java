package ch.juventus.threads;

public class Main {

    public static void main(String[] args) {

        Thread a = new MyThread();
        Thread b = new MyThread();
        Thread c = new MyThread();
        Thread d = new MyThread();
        Thread e = new MyThread();
        Thread f = new MyThread();
        Thread g = new MyThread();
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();

    }
}
