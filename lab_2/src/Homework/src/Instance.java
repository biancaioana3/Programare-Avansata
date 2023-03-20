package Homework.src;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Instance {
    private List<Location> locations;
    private List<Road> roads;

    public Instance() {
        this.locations = new ArrayList<>();
        this.roads = new ArrayList<>();
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }

    //adaugarea unei locatii sau a unui drum nou, doar daca nu exista deja
    public void addLocations(Location location) {
        int condition = 1;
        for (Location value : locations) {
            if (value.equals(location)) {
                condition = 0;
                break;
            }
        }
        if (condition == 1)
            locations.add(location);
    }

    public void addRoads(Road road) {
        int condition = 1;
        for (Road value : roads) {
            if (value.equals(road)) {
                condition = 0;
                break;
            }
        }
        if (condition == 1)
            roads.add(road);
    }

//    public boolean isValid() {
//        for (Road road : roads)
//
//                return false;
//        return true;
//    }

//    public boolean isRoad(Location locationStart, Location locationFinish) {
//        Set<Location> visited = new HashSet<>();
//        if (locationStart == locationFinish)
//            return true;
//        visited.add(locationStart);
//        for (Road road : roads) {
//
//        }
//        visited.remove(locationStart);
//        return false;
//    }
}
