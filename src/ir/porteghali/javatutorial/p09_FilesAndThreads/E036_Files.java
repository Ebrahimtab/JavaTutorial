package ir.porteghali.javatutorial.p09_FilesAndThreads;

import java.io.File;

public class E036_Files {

    public E036_Files() {
        File file = new File(
                "C:/Users/Ebrahim/Desktop/New folder/video/UEFA Champions League 2018-19 Intro HD-1080p.mp4");

        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.length()/1024/1024 + " MB");
    }
}
