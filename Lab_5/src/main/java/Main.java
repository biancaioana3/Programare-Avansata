import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        // Adaugă două documente la catalog
        Document article = new Document("article-1", "Articol 1", null, "https://www.example.com/articol1");
        article.addTag("autor", "John Doe");
        article.addTag("an", "2022");
        catalog.addDocument(article);

        Document book = new Document("book-1", "Carte 1", "/prog/Lab_5/src/java/test.pdf", null);
        book.addTag("autor", "Jane Doe");
        book.addTag("an", "2005");
        book.addTag("editura", "Editura X");
        catalog.addDocument(book);
        System.out.println(catalog);

        CatalogApp catalogApp = new CatalogApp(catalog);
        // Salvează catalogul într-un fișier JSON
        try {
            catalogApp.save(catalogApp.load("catalog.json"), "/prog/Lab_5/src/java/");
            System.out.println("Catalogul a fost salvat cu succes în fișierul catalog.json.");
        } catch (IOException | InvalidCatalogException e) {
            System.err.println("A apărut o eroare la salvarea catalogului: " + e.getMessage());
        }

        // Încarcă catalogul din fișierul JSON și afișează documentele
        try {
            Catalog catalogIncarcat = catalogApp.load("catalog.json");
            List<Document> documente = catalogIncarcat.getDocuments();

            System.out.println("Catalogul încărcat din fișierul catalog.json conține următoarele documente:");

            for (Document document : documente) {
                System.out.println("ID: " + document.getId());
                System.out.println("Nume: " + document.getName());
                System.out.println("Cale: " + document.getPath());
                System.out.println("URL: " + document.getUrl());

                Map<String, String> tags = document.getTags();
                System.out.println("Tag-uri:");
                for (String tagName : tags.keySet()) {
                    System.out.println("  " + tagName + ": " + tags.get(tagName));
                }

                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("A apărut o eroare la încărcarea catalogului: " + e.getMessage());
        } catch (InvalidCatalogException e) {
            throw new RuntimeException(e);
        }
    }
}
