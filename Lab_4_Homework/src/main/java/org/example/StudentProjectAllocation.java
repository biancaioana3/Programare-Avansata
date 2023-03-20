package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class StudentProjectAllocation {

    private List<Student> students;
    private List<Project> projects;

    public StudentProjectAllocation(int numStudents, int numProjects) {
        Faker faker = new Faker();
        Random random = new Random();

        // generate students with random names and preferences
        students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            List<Project> prefs = new ArrayList<>();
            for (int j = 0; j < numProjects; j++) {
                if (random.nextBoolean()) {
                    prefs.add(new Project(j, faker.job().title()));
                }
            }
            students.add(new Student(i, faker.name().fullName(), prefs));
        }
        // generate projects with random names
        projects = new ArrayList<>();
        for (int i = 0; i < numProjects; i++) {
            projects.add(new Project(i, faker.job().title()));
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public List<Student> getStudentsWithFewPreferences() {
        double avgPrefs = students.stream().mapToDouble(s -> s.getPreferences().size()).average().orElse(0.0);
        return students.stream().filter(s -> s.getPreferences().size() < avgPrefs).collect(Collectors.toList());
    }

    public List<Pair> findMaxMatching() {
        List<Pair> matching = new ArrayList<>();
        List<Student> unmatchedStudents = new ArrayList<>(students);

        while (!unmatchedStudents.isEmpty()) {
            Student student = unmatchedStudents.remove(0);
            Project bestProject = null;
            int bestScore = -1;
            for (Project project : student.getPreferences()) {
                if (matching.stream().noneMatch(p -> p.getProject().equals(project))) {
                    int score = project.getPreferences().indexOf(student);
                    if (score > bestScore) {
                        bestProject = project;
                        bestScore = score;
                    }
                }
            }
            if (bestProject != null) {
                matching.add(new Pair(student, bestProject));
                unmatchedStudents.removeIf(s -> s.equals(bestProject.getAssignedStudent()));
                bestProject.setAssignedStudent(student);
            }
        }

        return matching;
    }
