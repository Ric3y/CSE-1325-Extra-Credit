public class Webserver {
    private String name;
    private String webPageUrl;
    private String contents;

    public WebServer(String name, String webPageUrl, String contents) {
        this.name = name;
        this.webPageUrl = webPageUrl;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebPageUrl() {
        return webPageUrl;
    }

    public void setWebPageUrl(String webPageUrl) {
        this.webPageUrl = webPageUrl;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public boolean webPageEquals(String otherUrl) {
        return this.webPageUrl.equals(otherUrl);
    }

    public boolean webPageAdd(String url, String contents) {
        if (!webPageEquals(url)) {
            setWebPageUrl(url);
            setContents(contents);
            return true;
        }
        return false;
    }

    public boolean webPageUpdate(String url, String newContents) {
        if (webPageEquals(url)) {
            setContents(newContents);
            return true;
        }
        return false;
    }
}
