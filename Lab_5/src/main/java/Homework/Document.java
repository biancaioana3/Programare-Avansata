package Homework;

import java.util.Map;

public class Document {
    private String id;
    private String name;
    private String path;
    private String url;
    private Map<String, String> tags;

    public Document(String id, String name, String path, String url, Map<String, String> tags) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.url = url;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getUrl() {
        return url;
    }

    public Map<String, String> getTags() {
        return tags;
    }
}

