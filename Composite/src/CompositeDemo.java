public class CompositeDemo {
    public static void main(String args[]) {
        FirefoxBrowser firefoxBrowser= new FirefoxBrowser(1, "Firefox Browser",
                "C:\\Program Files\\Mozilla Firefox\\firefox.exe\"");
        GoogleBrowser googleBrowser = new GoogleBrowser(2, "Google Browser",
                "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        InternetExplorerBrowser internetExplorerBrowser = new InternetExplorerBrowser(3, "Internet Explorer Browser",
                "C:\\Program Files\\Internet Explorer\\iexplore.exe");
        OperaBrowser operaBrowser = new OperaBrowser(4, "Opera Browser",
                "C:\\Users\\shepe\\AppData\\Local\\Programs\\Opera\\launcher.exe");

        BrowserIntegrator browserIntegrator = new BrowserIntegrator("Browser Integrator");
        browserIntegrator.addBrowser(firefoxBrowser);
        browserIntegrator.addBrowser(googleBrowser);
        browserIntegrator.addBrowser(internetExplorerBrowser);
        browserIntegrator.addBrowser(operaBrowser);
        browserIntegrator.printBrowserName();
        browserIntegrator.printBrowserLocation();
    }
}
