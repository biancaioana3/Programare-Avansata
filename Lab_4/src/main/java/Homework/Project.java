package Homework;
import java.util.ArrayList;
import java.util.List;
public class Project {


    private String name;
    private List<Student> preferences;
    private  Student assignedStudent;

    public Project(String name) {
        this.name = name;
        this.preferences = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public List<Student> getPreferences() {
        return preferences;
    }

    public void addPreference(Student student) {
        preferences.add(student);
    }

    @Override
    public String toString() {
        return "Project [name=" + name + ",  + , preferences="
                + preferences + "]";
    }

    public void setAssignedStudent(Student student) {
        this.assignedStudent = student;
    }

    public Student getAssignedStudent() {
        return assignedStudent;
    }
}
