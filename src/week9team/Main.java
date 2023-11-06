package week9team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Passenger m1 = new Passenger("Amna", 21, 42);

        ArrayList<Taxi> taxiList = new ArrayList<>();
        taxiList.add(new Taxi(true, 1, 4, 5));
        taxiList.add(new Taxi(true, 2, 5, 4));
        taxiList.add(new Taxi(true, 3, 2, 2));
        taxiList.add(new Taxi(true, 5, 2, 3));

        manager.findNearestTaxi(m1, taxiList);
    }
}

