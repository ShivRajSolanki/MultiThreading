package multiTaskFileDownloader;

public class FileDownloadTask extends Thread{
    private String fileName;

    public FileDownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println(fileName + " download started...");

        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000); // 1 second delay
                System.out.println(fileName + " downloading... " + (i * 20) + "%");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(fileName + " download completed ✅");
    
}
}
