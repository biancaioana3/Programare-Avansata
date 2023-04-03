package Homework;

import java.awt.*;
import java.io.File;

public class ViewCommand implements Command {
    private Catalog catalog;
    private String id;

    public ViewCommand(Catalog catalog, String id) {
        this.catalog = catalog;
        this.id = id;
    }

    public void execute() throws Exception {
        Document document = catalog.get(id);
        String path = document.getPath();
        if (path != null) {
            // Open the document using the native operating system application
            File file = new File(path);
            Desktop.getDesktop().open(file);
        } else {
            throw new Exception("Document does not have a path or a URL.");
        }
    }
}