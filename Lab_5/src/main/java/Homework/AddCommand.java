package Homework;

class AddCommand implements Command {
    private Document document;

    public AddCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() throws InvalidDataException, InvalidCommandException {
        // TODO: Implement adding the document to the catalog
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
