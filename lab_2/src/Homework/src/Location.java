import java.util.Objects;

public class Location {
    private String name;
    private String location;
    private float lenght;
    private int x;
    private int y;

    public Location(String name, int x, int y, String location, float lenght){
        this.name=name;
        this.x=x;
        this.y=y;
        this.location=location;
        this.lenght=lenght;
    }
    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public String getLocation() {
        return location;
    }

    public void setCountry(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Location))
            return false;
        Location comp = (Location) obj;
        return ( comp.name==name && comp.x==x && comp.y==y);
        //return super.equals(obj);
    }

    public double distanceTo(Location other) {
        double dx = x - other.getX();
        double dy = y - other.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, x, y);
    }
}
