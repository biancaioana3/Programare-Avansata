package Homework.src;

import java.util.Objects;

public class Road {
    private String type;
    private int lenght;
    private int speed_limit;


    public Road(String type, int lenght, int speend_limit){

        this.type=type;
        this.lenght=lenght;
        this.speed_limit=speend_limit;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength(){
        return lenght;
    }

    public void setLength(int len){
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
