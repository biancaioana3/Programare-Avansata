package Homework;

import java.util.List;

class ListCommand implements Command {
    private List<Document> documents;

    public ListCommand(List<Document> documents) {
        this.documents = documents;
    }

    @Override
    public void execute() throws InvalidDataException, InvalidCommandException {
        if (documents.isEmpty()) {
            System.out.println("The catalog is empty.");
            return;
        }

        System.out.printf("%-10s | %-50s | %-50s | %-50s | %s\n", "ID", "Name", "Path", "URL", "Tags");
        for (Document doc : documents) {
            System.out.printf("%-10s | %-50s | %-50s | %-50s | %s\n", doc.getId(), doc.getName(), doc.getPath(), doc.getUrl(), doc.getTags());
        }
    }
}
