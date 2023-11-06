package week9team;
import java.util.ArrayList;

public class Manager {
    private ArrayList<Taxi> taxis = new ArrayList<>();
    private Passenger m1;

    public void findNearestTaxi(Passenger m1, ArrayList<Taxi> taxis) {
        Taxi nearestTaxiToM1 = null;
        int minDistanceM1 = 1000; // Initialize to a large value

        for (Taxi t : taxis) {
            if (t.isAvailable()) {
                int distanceToM1 = calculateDistance(m1.getX(), m1.getY(), t.getX(), t.getY());

                if (distanceToM1 < minDistanceM1) {
                    minDistanceM1 = distanceToM1;
                    nearestTaxiToM1 = t;
                }
            }
        }

        System.out.println("Nearest taxi to Passenger m1: " + nearestTaxiToM1.getId());
    }

    private int calculateDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    public void addTaxi(Taxi taxi) {
        taxis.add(taxi);
    }
}