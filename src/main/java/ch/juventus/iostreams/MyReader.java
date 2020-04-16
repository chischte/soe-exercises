package ch.juventus.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader {
    Reader reader;

    {
        try {
            reader = new FileReader("src//main/java/ch/juventus/iostreams/myFile.txt");
            var data = reader.read();
            while(data !=-1){
                char dataChar = (char)data;
                System.out.print(dataChar);
                data = reader.read();
            }
            System.out.println(" ");


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFile(){

    }

}

