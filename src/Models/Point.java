package Models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // distance(Point dest) - distance from current point to the dest point

    // toString
    @Override
    public String toString() {
        return "point{ " +
                "\nx: " + x +
                "\ny: " + y;
    }
}