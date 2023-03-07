import java.util.Objects;

public class Road {
    private int lenght;
    private int speedLimit;

    public Road( int lenght, int speend_limit){

        this.lenght=lenght;
        this.speedLimit=speend_limit;
    }

    public int getLenght(){
        return lenght;
    }

    public void setLenght(int len){
        this.lenght = len;
    }
    public int getSpeedLimit(){
        return speedLimit;
    }
    public void setSpeedLimit(int speed){
        this.speedLimit=speed;
    }

    @Override
    public String toString() {
        return "Road{" +
                "lenght=" + lenght +
                ", speedLimit=" + speedLimit +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Road))
            return false;
        Road comp = (Road) obj;
        return ( comp.lenght==lenght);
        //return super.equals(obj);
    }
    public double getTravelTime() {
        return lenght / speedLimit;
    }
    @Override
    public int hashCode() {
        return Objects.hash(lenght, speedLimit);
    }
}
