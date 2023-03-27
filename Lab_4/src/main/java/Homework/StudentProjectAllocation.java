package Homework;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentProjectAllocation {

    private List<Student> students;
    private List<Project> projects;
    public StudentProjectAllocation() {

    }
    public StudentProjectAllocation(List<Student> students) {
        this.students = students;

    }

    public String getRandom() {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();

        return firstName;
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
                Project finalBestProject = bestProject;
                unmatchedStudents.removeIf(s -> s.equals(finalBestProject.getAssignedStudent()));
                bestProject.setAssignedStudent(student);
            }
        }

        return matching;
    }
}
