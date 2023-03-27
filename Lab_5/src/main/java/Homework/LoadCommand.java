package Homework;

class LoadCommand implements Command {
    private String fileName;

    public LoadCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() throws InvalidDataException, InvalidCommandException {
        // TODO: Implement loading the catalog from the file
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
