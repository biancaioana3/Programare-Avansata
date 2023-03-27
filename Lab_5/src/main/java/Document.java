import java.util.Map;
import java.util.HashMap;


public class Document {
    private String id;
    private String name;
    private String path;
    private String url;
    private Map<String, String> tags = new HashMap<String, String>();

    public Document(String id, String name, String path, String url) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.url = url;
    }

    public void addTag(String name, String value) {
        tags.put(name, value);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }


}
