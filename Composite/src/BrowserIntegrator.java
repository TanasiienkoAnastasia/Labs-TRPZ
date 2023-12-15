import java.util.ArrayList;
import java.util.List;

public class BrowserIntegrator implements Browser {
    private String name;

    private List<Browser> childBrowsers;

    public BrowserIntegrator(String name) {
        this.name = name;
        this.childBrowsers = new ArrayList<>();
    }

    public void printBrowserName() {
        childBrowsers.forEach(Browser::printBrowserName);
    }

    public void printBrowserLocation() {
        childBrowsers.forEach(Browser::printBrowserLocation);
    }


    public void addBrowser(Browser department) {
        childBrowsers.add(department);
    }
}
