import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("add", "delete");
    }

    public void addFile(String filePath) {
        this.file = new File(filePath);
        events.notify("add", file);
    }

    public void deleteFile(String filePath) throws Exception {
        if (this.file != null) {
            events.notify("delete", file);
        } else {
            throw new Exception("Please add a file first.");
        }
    }
}
