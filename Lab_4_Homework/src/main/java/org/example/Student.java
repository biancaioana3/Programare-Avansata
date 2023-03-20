package org.example;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Project> preferences;

    public Student(int id, String name, List<Project> preferences) {
        this.id = id;
        this.name = name;
        this.preferences = preferences;
    }

    public int getId() {
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