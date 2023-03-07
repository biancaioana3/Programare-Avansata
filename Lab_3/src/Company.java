import java.util.ArrayList;
import java.util.List;

public class Company implements Comparable<Company>, Node {
    private String name;
    private List<Person> employees;

    /**
     *
     * @param name is name of company
     * emlpoyees is a list o company's employees
     */
    public Company(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Person employee) {
        employees.add(employee);
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Company o) {
        return this.name.compareTo(o.getName());
    }
    /**
     * @compareTo return 0 if the company objects are equal
     */
}