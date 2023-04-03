package Homework;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private final List<Document> documents;

    public Catalog(){
        this.documents = new ArrayList<Document>();
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public Document get(String id){
        return documents.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }
    public void addDocument(Document name){
        documents.add(name);

    }
    @Override
    public String toString() {
        return "Catalog{documents=" + documents +
                '}';
    }

}