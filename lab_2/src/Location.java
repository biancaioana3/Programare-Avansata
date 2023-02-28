public class Location {
    private String name; 
    private location type;
    private int x;
    private int y;

    public Location(String name, location type, int x, int y){
        this.name=name;
        this.type=type;
        this.x=x;
        this.y=y;
    }

    public String getName() {
      return name;
    }

    public void setName(String newName) {
      this.name = newName;
    }

    public location getType(){
        return type;
    }

    public void setType(location type){
        this.type = type;
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
                ", type=" + type +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
