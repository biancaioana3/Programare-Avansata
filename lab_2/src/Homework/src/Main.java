
public class Main {
    public static void main(String[] args){
        City first_location = new City("Iasi", 500,20,"test", 1000);
        Road fisrt_road = new Express(12000, 200);
        Road last_road = new Road( 9000, 120);

        System.out.println(first_location.toString());
        System.out.println(fisrt_road.toString());
        System.out.println(last_road.toString());

    }
}