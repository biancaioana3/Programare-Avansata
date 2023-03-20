package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
                new Student("John", "S0", firstPreferred),
                new Student("Mary", "S1", secondPreferred),
                new Student("Jane", "S2", threadPreferred)
        );

        double averagePreferences = students.stream()
                .mapToInt(Student::nrPreferences)
                .average()
                .orElse(0);

        List<Student> studentsWithLessPreferences = students.stream()
                .filter(student -> student.nrPreferences() < averagePreferences)
                .collect(Collectors.toList());

        System.out.println("Studenții cu un număr de preferințe mai mic decât numărul mediu de preferințe sunt:");
        studentsWithLessPreferences.forEach(System.out::println);

    }
}