package Homework;

public class Main {
    public static void main(String[] args) throws Exception {

        Catalog catalog= new Catalog();
        Document doc1 = new Document("1", "Document 1","C:\\Users\\bianc\\Desktop\\materiale facultate\\Programare Avansata");
        Document doc2 = new Document("2", "Document 2","C:\\Users\\bianc\\Desktop\\materiale facultate\\Programare Avansata");
        catalog.addDocument(doc1);
        catalog.addDocument(doc2);

        Command addCommand = new AddCommand(catalog, "1", "ADD","C:\\Users\\bianc\\Desktop\\materiale facultate\\Programare Avansata");
        Command listCommand = new ListCommand(catalog);
        Command viewCommand = new ViewCommand(catalog,"1");
        Command reportCommand = new ReportCommand(catalog, "C:\\Users\\bianc\\Desktop\\materiale facultate\\Programare Avansata");

        addCommand.execute();
        listCommand.execute();
        viewCommand.execute();
        reportCommand.execute();

    }
}


