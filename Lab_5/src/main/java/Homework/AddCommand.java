package Homework;

import java.util.Map;

public class AddCommand implements Command {
    private DocumentCatalog catalog;
    private String id;
    private String name;
    private String path;
    private String url;
    private Map<String, String> tags;

    public AddCommand(DocumentCatalog catalog, String id, String name, String path, String url, Map<String, String> tags) {
        this.catalog = catalog;
        this.id = id;
        this.name = name;
        this.path = path;
        this.url = url;
        this.tags = tags;
    }

    public void execute() throws Exception {
        Document document = new Document(id, name, path, url, tags);
        catalog.addDocument(document);
        System.out.println("Document added successfully.");
    }
}
