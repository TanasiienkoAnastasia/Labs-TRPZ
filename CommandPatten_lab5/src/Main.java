import Commands.DownloadFileCommand;
import Commands.RemoveFileCommand;
import InvokerClasses.FileInvoker;
import ReceiverClasses.DownloadManagerFileSystemReceiver;

public class Main {
    public static void main(String[] args) {
        DownloadManagerFileSystemReceiver fs = new DownloadManagerFileSystemReceiver();

        //creating command and associating with receiver
        DownloadFileCommand downloadFileCommand = new DownloadFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(downloadFileCommand);

        //perform action on invoker object
        file.execute();


        RemoveFileCommand removeFileCommand = new RemoveFileCommand(fs);
        file = new FileInvoker(removeFileCommand);
        file.execute();
    }
}
