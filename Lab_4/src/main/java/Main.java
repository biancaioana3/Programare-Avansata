import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student s0 = new Student("S0", new HashSet<>(Arrays.asList(
                new Project("P0"), new Project("P1"), new Project("P2")
        )));
        Student s1 = new Student("S1", new HashSet<>(Arrays.asList(
                new Project("P0"), new Project("P1")
        )));
        Student s2 = new Student("S2", new HashSet<>(Arrays.asList(
                new Project("P0")
        )));

        Project p0 = new Project("P0");
        Project p1 = new Project("P1");
        Project p2 = new Project("P2");

        TreeSet<Student> students = new TreeSet<>(Arrays.asList(s0, s1, s2));
        students.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName()));

        TreeSet<Project> projects = new TreeSet<>(Arrays.asList(p0, p1, p2));
        projects.stream()
                .sorted()
                .forEach(p -> System.out.println(p.getName()));

    }
}