package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentProjectAllocation random = new StudentProjectAllocation();

        List<Project> firstPreferred = new ArrayList<Project>();
        firstPreferred.add(new Project(random.getRandom()));
        firstPreferred.add(new Project(random.getRandom()));
        firstPreferred.add(new Project(random.getRandom()));

        List<Project> secondPreferred = new ArrayList<Project>();
        secondPreferred.add(new Project(random.getRandom()));

        List<Project> threadPreferred = new ArrayList<Project>();
        threadPreferred.add(new Project(random.getRandom()));

        List<Student> students = Arrays.asList(
                new Student(random.getRandom(), "S0", firstPreferred),
                new Student(random.getRandom(), "S1", secondPreferred),
                new Student(random.getRandom(), "S2", threadPreferred)
        );

        StudentProjectAllocation student = new StudentProjectAllocation(students);
        System.out.println(student.findMaxMatching());

    }
}