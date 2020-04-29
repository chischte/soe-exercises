package ch.juventus.iostreams;

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
        //fileExercises.deleteFile();
        System.out.println("RUN WITH DEBUG BREAKPOINT IN deleteAll() TO SEE THE MAGIC HAPPEN!");
        fileExercises.deleteFolder();


    }
}
