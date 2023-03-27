package Homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DocumentManagementSystem {
    private static DocumentCatalog catalog = new DocumentCatalog();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("> ");
            String line = reader.readLine().trim();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = line.split("\\s+");
            String command = parts[0];

            try {
                switch (command) {
                    case "load":
                        if (parts.length < 3) {
                            throw new InvalidDataException("Not enough data provided for the load command.");
                        }
                        String id = parts[1];
                        String name = parts[2];
                        String path = null;
                        String url = null;
                        Map<String, String> tags = new HashMap<>();
                        for (int i = 3; i < parts.length; i++) {
                            String[] tagParts = parts[i].split(":");
                            if (tagParts.length == 2) {
                                String tagName = tagParts[0];
                                String tagValue = tagParts[1];
                                tags.put(tagName, tagValue);
                            } else {
                                throw new InvalidDataException("Invalid tag format: " + parts[i]);
                            }
                        }
                        Document document = new Document(id, name, path, url, tags);
                        catalog.addDocument(document);
                        System.out.println("Document loaded successfully.");
                        break;
                    case "list":
                        Command listCommand = new ListCommand(catalog);
                        listCommand.execute();
                        break;
                    case "view":
                        if (parts.length < 2) {
                            throw new InvalidDataException("Not enough data provided for the view command.");
                        }
                        String viewId = parts[1];
                        Command viewCommand = new ViewCommand(catalog, viewId);
                        viewCommand.execute();
                        break;
                    case "report":
                        if (parts.length < 2) {
                            throw new InvalidDataException("Not enough data provided for the report command.");
                        }
                        String outputFilePath = parts[1];
                        Command reportCommand = new ReportCommand(catalog, outputFilePath);
                        reportCommand.execute();
                        break;
                    default:
                        throw new InvalidCommandException("Unknown command: " + command);
                }
            } catch (InvalidDataException e) {
                System.out.println("Invalid data: " + e.getMessage());
            } catch (InvalidCommandException e) {
                System.out.println("Invalid command: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
