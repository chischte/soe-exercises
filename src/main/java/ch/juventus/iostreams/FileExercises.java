package ch.juventus.iostreams;

import java.io.File;
import java.io.IOException;

public class FileExercises {

    public void createFile() {
        File file = new File("c:/dir/dir/dir");
        file.mkdirs();
        File newfile = new File("c:/dir/dir/dir/haudi.txt");
        try {
            newfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        
    }
}
