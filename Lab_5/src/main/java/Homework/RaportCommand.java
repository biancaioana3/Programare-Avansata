package Homework;

import java.util.List;

class ReportCommand implements Command {
    private List<Document> documents;
public ReportCommand(List<Document> documents) {
        this.documents = documents;
        }

@Override
public void execute() throws InvalidDataException, InvalidCommandException {
        // TODO: Implement creating an HTML report using a template engine
        throw new UnsupportedOperationException("Not implemented yet");
        }
}
