package week09;

public class Taxi{

    private boolean availability;
    private int id;
    private int x;
    private int y;

    public Taxi(boolean availability, int id, int x, int y) {
        this.availability = availability;
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public boolean isAvailable() {
        return availability;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

