package ch.juventus.iostreams;

import java.io.File;
import java.io.IOException;

public class FileExercises {

    public void createFile() {
        File file = new File("c:/loesch/dir/dir");
        file.mkdirs();
        File newfile = new File("c:/loesch/dir/dir/haudi.txt");
        try {
            newfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        File file = new File("c:/loesch/dir/dir/haudi.txt");
        file.delete();

    }

    public void deleteFolder() {
        File file = new File("c:/loesch");
        deleteAll(file);

    }

    public boolean deleteAll(File fileToDelete) {
        File[] files = fileToDelete.listFiles(); // create an array of files
        if (files != null) {
            for (File file : files) { // iterate through array
                if (file.isDirectory()) {
                    deleteAll(file); // recursion "entry and exit point"
                    // go deeper in until a file is found
                } else {
                    file.delete(); // then delete the file and return to entry point
                }
            }
        }
        return fileToDelete.delete(); // returns true if deleted successfully
    }
}
