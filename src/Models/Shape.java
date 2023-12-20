package Models;

import java.util.ArrayList;
import java.util.Arrays;
public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    ArrayList<Point> Points = new ArrayList<Point>();
    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        Points.add(point);
    }
    /*
    public void getElements() {
        for(Point pnt: Points) {
            System.out.println(pnt);
        }
    }
    */

    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;
        int rightPoint = 0;
        for(int i = 0;i<Points.size();i++) {
            rightPoint = (rightPoint + 1) % Points.size();
            perimeter += Points.get(i).distance(Points.get(rightPoint));
        }
        return perimeter;
    }
    // getAverageSide()
    public double getAverage() {
        double[] perimeters = new double[Points.size()];
        int rightPoint = 0;
        for(int i = 0;i<Points.size();i++) {
            rightPoint = (rightPoint + 1) % Points.size();
            perimeters[i] =  Points.get(i).distance(Points.get(rightPoint));
        }
        Arrays.sort(perimeters);
        int mediumIndex = Points.size() / 2;
        return perimeters[mediumIndex];
    }
    public double getLongestSide() {
        double maxPerimeterSide = 0;
        int rightPoint = 0;
        for (int i = 0;i<Points.size();i++) {
            rightPoint = (rightPoint + 1) % Points.size();
            if(Points.get(i).distance(Points.get(rightPoint)) > maxPerimeterSide) {
                maxPerimeterSide = Points.get(i).distance(Points.get(rightPoint));
            }
        }
        return maxPerimeterSide;
    }
}