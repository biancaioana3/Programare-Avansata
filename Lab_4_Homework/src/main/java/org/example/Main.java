package org.example;

public class Main {
    public static void main(String[] args) {
        StudentProjectAllocation spa = new StudentProjectAllocation(5, 3);

        System.out.println("Students:");
        for (Student student : spa.getStudents()) {
            System.out.println(student);
        }

        System.out.println("Projects:");
        for (Project project : spa.getProjects()) {
            System.out.println(project);
        }

        System.out.println("Students with few preferences:");
        for (Student student : spa.getStudentsWithFewPreferences()) {
            System.out.println(student);
        }

        List<Pair> matching = spa.findMaxMatching();
        System.out.println("Matching:");
        for (Pair pair : matching) {
            System.out.println(pair);
        }
    }

}