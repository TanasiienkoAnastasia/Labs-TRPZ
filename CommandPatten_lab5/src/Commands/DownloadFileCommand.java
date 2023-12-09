package Commands;

import CommandInterface.Command;
import ReceiverClasses.DownloadManagerFileSystemReceiver;

public class DownloadFileCommand implements Command {
    private DownloadManagerFileSystemReceiver downloadManager;

    public DownloadFileCommand(DownloadManagerFileSystemReceiver dm){
        this.downloadManager=dm;
    }

    @Override
    public void execute() {
        //download command is forwarding request to downloadFile method
        this.downloadManager.downloadFile();
    }
}
