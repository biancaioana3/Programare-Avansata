package Homework;

import java.util.List;

public class Student {

    private String id;
    private String name;
    private List<Project> preferences;


    public Student(String name, String id){
        this.id = id;
    }
    public Student(String name, String id, List<Project> preferences) {
        this.name =name;
        this.id = id;
        this.preferences = preferences;
    }

    public int nrPreferences(){
        return preferences.size();
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Project> getPreferences() {
        return preferences;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", preferences=" + preferences + "]";
    }

}
