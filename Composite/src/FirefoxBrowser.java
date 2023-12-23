public class FirefoxBrowser implements Browser{

    private Integer id;
    private String name;
    private String location;

    public FirefoxBrowser(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @Override
    public void printBrowserName() {
        System.out.println(getClass().getSimpleName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void printBrowserLocation() {
        System.out.println("Firefox location: "+getLocation());
    }
}
