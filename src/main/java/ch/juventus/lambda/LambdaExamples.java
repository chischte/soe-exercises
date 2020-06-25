package ch.juventus.lambda;

public class LambdaExamples {

    interface PrintDate {
        void sayMessage(String message);
    }

    public static void main(String[] args){

        // Erzeuge eine Function<Date, String> die ‘Jetzt ist ’ + das
        // gegebene Datum als String zurückgibt.

        PrintDate printDate = (message) ->
                System.out.println("Jetzt ist " + message);

        printDate.sayMessage("25 Juni 2020");



    }

}
