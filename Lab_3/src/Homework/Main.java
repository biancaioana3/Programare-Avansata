package Homework;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Network network = new Network();

        Person ana = new Person("Ana", new Date(1980, 1, 1), "Manager");
        Programmer bianca = new Programmer("Bianca", new Date(1990, 1, 1), "Java");
        Designer mihai = new Designer("Mihai", new Date(2000, 1, 1), "Minimalist");
        Company companie = new Company("Companie");

        ana.addPersonRelationship(bianca, "Prieten");
        ana.addPersonRelationship(mihai, "Coleg");
        bianca.addCompanyRelationship(companie, "Developer");
        mihai.addCompanyRelationship(companie, "Designer");
        companie.addEmployee(mihai, "Designer");

        network.addNode(ana);
        network.addNode(bianca);
        network.addNode(mihai);
        network.addNode(companie);

        List<Object> sortedNodes = network.getNodesOrderedByImportance();
        for (Object node : sortedNodes) {
            if (node instanceof Person) {
                Person person = (Person) node;
                System.out.println(person.getName() + " (Person, " + person.getOccupation() + ")");
                System.out.println("  Birth date: " + person.getBirthDate());
                System.out.println("  Number of connections: " + person.getNumberOfConnections());
            } else if (node instanceof Company) {
                Company company = (Company) node;
                System.out.println(company.getName() + " (Company)");
                System.out.println("  Number of employees: " + company.getNumberOfEmployees());
            }
            System.out.println();
        }
    }
}
