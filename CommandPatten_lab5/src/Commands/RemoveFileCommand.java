package Commands;

import CommandInterface.Command;
import ReceiverClasses.DownloadManagerFileSystemReceiver;

public class RemoveFileCommand implements Command {
    private DownloadManagerFileSystemReceiver downloadManager;

    public RemoveFileCommand(DownloadManagerFileSystemReceiver dm){
        this.downloadManager=dm;
    }

    @Override
    public void execute() {
        //remove command is forwarding request to removeFile method
        this.downloadManager.removeFile();
    }
}
