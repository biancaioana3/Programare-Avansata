package Homework.src;

public class Main {

    public static void main(String[] args){
        Location firstLocation = new Location("Iasi", "AIROPORTS", 10,20);
        Road fisrtRoad = new Road("EXPRESS", 12000, 200);
        Location lastLocation = new Location("Vrancea", "GAS_STATIONS", 43,50);
        Road lastRoad = new Road("HIGHWAYS", 9000, 120);

        System.out.println(firstLocation.toString());
        System.out.println(fisrtRoad.toString());
        System.out.println(lastLocation.toString());
        System.out.println(lastRoad.toString());

    }

}