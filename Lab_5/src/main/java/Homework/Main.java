package Homework;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DocumentManagementSystem dms = new DocumentManagementSystem();

        // Load the catalog from a file
        dms.run(new LoadCommand("catalog.txt"));

        // Add a new document
        Map<String, String> tags = new HashMap<>();
        tags.put("title", "Example Document");
        tags.put("author", "John Doe");
        Document doc = new Document("1", "example.txt", "/path/to/example.txt", null, tags);
        dms.run(new AddCommand(doc));

        // List the documents in the catalog
        dms.run(new ListCommand(dms.documents));

        // View a document
        dms.run(new ViewCommand(doc));

        // Create an HTML report of the catalog
        dms.run(new ReportCommand(dms.documents));
    }
}
