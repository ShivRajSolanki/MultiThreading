package multiTaskFileDownloader;

public class mainApp {
    public static void main(String[] args) {
        FileDownloadTask file1 = new FileDownloadTask("File-1");
        FileDownloadTask file2 = new FileDownloadTask("File-2");
        FileDownloadTask file3 = new FileDownloadTask("File-3");

        file1.start();
        file2.start();
        file3.start();

        System.out.println("All downloads started...");
    }
}
