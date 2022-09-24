package ir.porteghali.javatutorial.p10_OOP;

public class E052_Downloader {

    public void download(E052_DownloadListener downloadListener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    downloadListener.downloadCompleted(256, "C:/User/Ebrahim/download/file.txt");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
