package Homework;

import java.awt.*;
import java.io.File;
import java.net.URI;

public class ViewCommand implements Command {
    private DocumentCatalog catalog;
    private String id;

    public ViewCommand(DocumentCatalog catalog, String id) {
        this.catalog = catalog;
        this.id = id;
    }

    public void execute() throws Exception {
        Document document = catalog.getDocument(id);
        String path = document.getPath();
        String url = document.getUrl();
        if (path != null) {
            // Open the document using the native operating system application
            File file = new File(path);
            Desktop.getDesktop().open(file);
        } else if (url != null) {
            // Open the document using the default web browser
            Desktop.getDesktop().browse(new URI(url));
        } else {
            throw new Exception("Document does not have a path or a URL.");
        }
    }
}