package Homework;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private String name;
    private Map<Person, String> employees;

    public Company(String name){
        this.name = name;
        this.employees = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Person, String> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<Person, String> employees) {
        this.employees = employees;
    }

    public void addEmployee(Person employee, String position){
        employees.put(employee, position);
    }

    public int getNumberOfEmployees(){
        return employees.size();
    }
}
