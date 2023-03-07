import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BestRoute {
    private List<Location> locations;
    private List<Road> roads;

    public BestRoute(List<Location> locations, List<Road> roads) {
        this.locations = locations;
        this.roads = roads;
    }
    public boolean isValid() {
        Set<Location> uniqueLocations = new HashSet<>(locations);
        Set<Road> uniqueRoads = new HashSet<>(roads);
        if (uniqueLocations.size() != locations.size() || uniqueRoads.size() != roads.size()) {
            return false;
        }
        return true;
    }
}
