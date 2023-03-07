import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Node> nodeList = new ArrayList<>();
        Person personOne = new Person("Geo", 30, "44 Focsani");
        Person personTwo = new Person("Bianca", 25, "456 Iasi");
        Person personThree = new Person("Mihai", 25, "456 Iasi");
        Company company = new Company("Companie");
        company.addEmployee(personOne);
        company.addEmployee(personTwo);
        personOne.addFriend(personThree);
        personOne.addFriend(personTwo);
        nodeList.add(personOne);
        nodeList.add(personTwo);
        nodeList.add(personThree);
        nodeList.add(company);

        Collections.sort(nodeList, new Comparator<Node>() {
            @Override
            public int compare(Node companyOne, Node companyTwo) {
                return companyOne.getName().compareTo(companyTwo.getName());
            }
        });

        for (Node node : nodeList) {
            System.out.println(node.getName());
        }
    }
}