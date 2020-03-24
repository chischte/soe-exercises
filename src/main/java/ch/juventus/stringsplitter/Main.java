package ch.juventus.stringsplitter;

public class Main {
    public static void main(String[] args){
        StringSplitter stringSplitter = new StringSplitter();
        char firstCharReturned=stringSplitter.getFirstChar("ABCD");
        System.out.println(firstCharReturned);
    }
}
