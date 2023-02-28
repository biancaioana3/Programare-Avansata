enum location {
    CITIES, AIROPORTS, GAS_STATIONS,
  }
enum road {
    HIGHWAYS, EXPRESS, COUNTRY,
}
public class Main {   

    public static void main(String[] args){
        Location first_location = new Location("Iasi", location.AIROPORTS, 10,20);
        Road fisrt_road = new Road(road.EXPRESS, 12000, 200);
        Location last_location = new Location("Vrancea", location.GAS_STATIONS, 43,50);
        Road last_road = new Road(road.HIGHWAYS, 9000, 120);

        System.out.println(first_location.toString());
        System.out.println(fisrt_road.toString());
        System.out.println(last_location.toString());
        System.out.println(last_road.toString());    

    }

}
