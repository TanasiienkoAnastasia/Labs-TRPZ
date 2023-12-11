package ReceiverClasses;

import ReceiverClasses.FileSystemReceiver;

public class DownloadManagerFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void downloadFile() {
        System.out.println("Download file in download manager from specific url to the directory");
    }

    @Override
    public void removeFile() {
        System.out.println("Remove file from table and specific directory");
    }
}
