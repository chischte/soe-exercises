package ch.juventus.iostreams;

public class Main {
    public static void main(String[] args) {
        MyWriter mywriter = new MyWriter();
        mywriter.write("HAUDI");
        MyReader myreader = new MyReader();
    }
}
