package ch.juventus.threads;

public class Main {

    public static void main(String[] args) {

        // Example using "lang threads"

        java.lang.Thread a = new LangThread();
        java.lang.Thread b = new LangThread();
        java.lang.Thread c = new LangThread();
        a.start();
        b.start();
        c.start();


        // Example using "runnable threads":

        Runnable x = new RunnableThread();

        Thread x1=new Thread(x);
        Thread x2=new Thread(x);
        Thread x3=new Thread(x);

        System.out.println("State thread 1 " + x1.getState());
        System.out.println("State thread 2 " + x2.getState());
        System.out.println("State thread 3 " + x3.getState());

        x1.start();

        System.out.println("State thread 1 " + x1.getState());
        System.out.println("State thread 2 " + x2.getState());
        System.out.println("State thread 3 " + x3.getState());

        x2.start();

        System.out.println("State thread 1 " + x1.getState());
        System.out.println("State thread 2 " + x2.getState());
        System.out.println("State thread 3 " + x3.getState());


    }
}
