import java.util.Set;

public class Student implements Comparable<Student>{
    private String name;
    private Set<Project> projects;

    public Student(String name, Set<Project> projects){
        this.name = name;
        this.projects = projects;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }
}
