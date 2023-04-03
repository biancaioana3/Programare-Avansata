package Homework;

import java.util.HashMap;
import java.util.Map;

public class Document {
    private String id;
    private String name;
    private String path;

    private Map<String, String> tags;

    public Document(String id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.tags = new HashMap<>();
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



    public Map<String, String> getTags() {
        return tags;
    }
}

