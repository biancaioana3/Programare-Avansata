package Homework;

import java.util.Map;

public class AddCommand implements Command {
    private Catalog catalog;
    private String id;
    private String name;
    private String path;
    private String url;
    private Map<String, String> tags;

    public AddCommand(Catalog catalog, String id, String name, String path) {
        this.catalog = catalog;
        this.id = id;
        this.name = name;
        this.path = path;
    }

    public void execute() throws Exception {
        Document document = new Document(id, name, path);
        catalog.addDocument(document);
        System.out.println("Document added successfully.");
    }
}
