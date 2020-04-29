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

    public void deleteFile() {
        File file = new File("c:/dir/dir/dir/haudi.txt");
        file.delete();

    }

    public void deleteFolder() {
        File file = new File("c:/dir");
        deleteAll(file);

    }

    public boolean deleteAll(File fileToDelete) {
        File[] files = fileToDelete.listFiles();
        File[] filesDebug=files;
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteAll(file);
                } else {
                    file.delete();
                }

            }
        }
        return fileToDelete.delete();
    }

}
