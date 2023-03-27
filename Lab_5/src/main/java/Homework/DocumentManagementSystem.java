package Homework;

import java.util.ArrayList;
import java.util.List;

public class DocumentManagementSystem {
    private List<Document> documents;
    public DocumentManagementSystem() {
        documents = new ArrayList<>();
    }

    public void run(Command command) {
        try {
            command.execute();
        } catch (InvalidDataException e) {
            System.out.println("Invalid data: " + e.getMessage());
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command: " + e.getMessage());
        }
    }

}