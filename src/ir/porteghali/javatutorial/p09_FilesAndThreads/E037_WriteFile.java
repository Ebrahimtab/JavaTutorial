package ir.porteghali.javatutorial.p09_FilesAndThreads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class E037_WriteFile {

    public E037_WriteFile() {
        String data = "My name is Ebrahim";

        /**
         * create a new file
         */
        File file = new File("C:/Users/Ebrahim/Desktop/file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * write data into file
         */
        try {
            FileWriter fileWriter = new FileWriter("C:/Users/Ebrahim/Desktop/file.txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
