package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentCatalog {
    private Map<String, Document> documents;

    public DocumentCatalog() {
        documents = new HashMap<>();
    }

    public void addDocument(Document document) throws Exception {
        if (documents.containsKey(document.getId())) {
            throw new Exception("Document ID already exists.");
        }
        documents.put(document.getId(), document);
    }

    public Document getDocument(String id) throws Exception {
        if (!documents.containsKey(id)) {
            throw new Exception("Document ID does not exist.");
        }
        return documents.get(id);
    }

    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents.values());
    }
}

