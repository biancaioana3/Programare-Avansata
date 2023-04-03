package Homework;

import java.util.List;

public class ListCommand implements Command {
    private Catalog catalog;

    public ListCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    public void execute() throws Exception {
        List<Document> documents = catalog.getDocuments();
        for (Document document : documents) {
            System.out.println(document.getId() + ": " + document.getName());
        }
    }
}