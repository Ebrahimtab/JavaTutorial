package ir.porteghali.javatutorial.p10_OOP;

public class E052_Interface implements E052_DownloadListener {

    public E052_Interface() {

        System.out.println("E052_Interface");
        download();
        System.out.println("I'm working...");
    }

    private void download() {
        E052_Downloader downloader = new E052_Downloader();
        downloader.download(this);
    }

    @Override
    public void downloadCompleted(int fileLength, String filePath) {

        System.out.println("download completed");
        System.out.println("file length : " + fileLength + " MB");
        System.out.println("file path : " + filePath);
    }

    @Override
    public void downloadFailed() {

        System.out.println("download failed");
    }
}
