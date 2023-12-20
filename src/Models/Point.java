package Models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest) {
        return Math.sqrt(Math.pow(this.getX() - dest.getX(), 2) + Math.pow(this.getY() - dest.getY(), 2));
    }
    // toString
    @Override
    public String toString() {
        return "point { " +
                "\nx: " + x +
                "\ny: " + y + "\n}";
    }
}