package Homework;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportCommand implements Command {
    private DocumentCatalog catalog;
    private String outputFilePath;

    public ReportCommand(DocumentCatalog catalog, String outputFilePath) {
        this.catalog = catalog;
        this.outputFilePath = outputFilePath;
    }

    public void execute() throws Exception {
        List<Document> documents = catalog.getAllDocuments();

        Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
        cfg.setClassLoaderForTemplateLoading(getClass().getClassLoader(), "templates");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        Template template = cfg.getTemplate("report.ftlh");

        Map<String, Object> data = new HashMap<>();
        data.put("documents", documents);

        FileWriter writer = new FileWriter(new File(outputFilePath));
        template.process(data, writer);
        writer.close();

        System.out.println("Report created successfully.");
    }
}

