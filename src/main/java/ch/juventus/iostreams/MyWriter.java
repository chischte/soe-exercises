package ch.juventus.iostreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter {

    Writer myWriter;

    public void write(String messageToWrite) {
        {
            try {
                myWriter = new FileWriter("src//main/java/ch/juventus/iostreams/myFile.txt");
                StringBuffer outputText = new StringBuffer();
                outputText.append("This is the received message:  ");
                outputText.append(messageToWrite);
                myWriter.write(outputText.toString());
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



