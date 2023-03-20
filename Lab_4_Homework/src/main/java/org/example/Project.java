package org.example;
import java.util.ArrayList;
import java.util.List;
public class Project {
    private String name;
    private Student assignedStudent;
    private List<Student> preferences;

    public Project(String name){
        this.name = name;
        this.preferences =  new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Student getAssignedStudent() {
        return assignedStudent;
    }

    public void setAssignedStudent(Student assignedStudent) {
        this.assignedStudent = assignedStudent;
    }

    public List<Student> getPreferences() {
        return preferences;
    }

    public void addPreference(Student student) {
        preferences.add(student);
    }

    public String toString() {

        return "Student [name=" + name + ", preferences=" + preferences + "]";
    }


}