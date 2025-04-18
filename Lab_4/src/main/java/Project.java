public class Project implements Comparable<Project>{
    private String name;

    public Project(String name){
        this.name = name;
    }
    @Override
    public int compareTo(Project o) {
        return this.name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
