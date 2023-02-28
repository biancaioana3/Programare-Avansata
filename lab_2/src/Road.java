public class Road {
    private road type;
    private int lenght;
    private int speed_limit;
    
    public Road(road type, int lenght, int speend_limit){

        this.type=type;
        this.lenght=lenght;
        this.speed_limit=speend_limit;
    }
    public road getType() {
        return type;
    }
  
    public void setType(road type) {
        this.type = type;
    }

    public int getLenght(){
        return lenght;
    }

    public void setLenght(int len){
        this.lenght = len;
    }
    public int getSpeed_limit(){
        return speed_limit;
    }
    public void setSpeed_limit(int speed){
        this.speed_limit=speed;
    }

    @Override
    public String toString() {
        return "Road{" +
                "type=" + type +
                ", lenght=" + lenght +
                ", speed_limit=" + speed_limit +
                '}';
    }
}
