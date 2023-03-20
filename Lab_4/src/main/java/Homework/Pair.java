package Homework;

public class Pair {

    private Student student;
    private Project project;

    public Pair(Student student, Project project) {
        this.student = student;
        this.project = project;
    }

    public Student getStudent() {
        return student;
    }

    public Project getProject() {
        return project;
    }

    @Override
    public String toString() {
        return "Pair [student=" + student + ", project=" + project + "]";
    }

}



