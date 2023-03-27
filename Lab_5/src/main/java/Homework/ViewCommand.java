package Homework;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class ViewCommand implements Command {
    private Document document;

    public ViewCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() throws InvalidDataException, InvalidCommandException {
        if (Desktop.isDesktopSupported()) {
            try {
                if (document.getPath() != null) {
                    Desktop.getDesktop().open(new File(document.getPath()));
                } else if (document.getUrl() != null) {
                    Desktop.getDesktop().browse(java.net.URI.create(document.getUrl()));
                } else {
                    throw new InvalidDataException("The document does not have a path or a URL.");
                }
            } catch (IOException e) {
                throw new InvalidCommandException("Failed to open the document.");
            } else{
                throw new InvalidCommandException("Desktop operations are not supported on this platform.");
            }
        }
    }
}