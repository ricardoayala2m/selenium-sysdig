package enumeration;

public enum Region {
    EU1( "https://eu1.app.sysdig.com/"),
    USEast( "https://app.sysdigcloud.com/"),
    USWest("https://us2.app.sysdig.com/"),
    AP("https://app.au1.sysdig.com/"),
    USWestGCP("https://app.us4.sysdig.com/");

    private String URL;

    Region ( String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

}
