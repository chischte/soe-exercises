package ch.juventus.iostreams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // STRING WRITER:
        MyWriter mywriter = new MyWriter();
        mywriter.write("HAUDI");

        // STRING READER:
        MyReader myreader = new MyReader();

        // FILE CREATOR:
       FileExercises fileExercises= new FileExercises();
        fileExercises.createFile();
        // WAIT FOR USER INPUT:
        System.out.println("WAIT FOR ANY INPUT BEFORE DELETING ALL FILES:");
        Scanner userInput=new Scanner(System.in);
        String userInputString=userInput.nextLine();

        //fileExercises.deleteFile();
        System.out.println("RUN WITH DEBUG BREAKPOINT IN deleteAll() TO SEE THE MAGIC HAPPEN!");
        fileExercises.deleteFolder();


    }
}
