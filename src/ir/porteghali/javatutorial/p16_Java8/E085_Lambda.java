package ir.porteghali.javatutorial.p16_Java8;

import ir.porteghali.javatutorial.p10_OOP.E052_DownloadListener;

public class E085_Lambda {

    public E085_Lambda() {
        E052_DownloadListener downloadListener =
                (fileLength, filePath) -> System.out.println(filePath);

        downloadListener.downloadCompleted(1, "C:/User/Ebrahim/Desktop");
    }
}
