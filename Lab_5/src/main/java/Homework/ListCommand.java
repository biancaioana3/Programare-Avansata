package Homework;

import java.util.List;

public class ListCommand implements Command {
    private DocumentCatalog catalog;

    public ListCommand(DocumentCatalog catalog) {
        this.catalog = catalog;
    }

    public void execute() throws Exception {
        List<Document> documents = catalog.getAllDocuments();
        for (Document document : documents) {
            System.out.println(document.getId() + ": " + document.getName());
        }
    }
}