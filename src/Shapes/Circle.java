package Shapes;

public class Circle {
    private static int numberOfCircles = 0;
    private double radius;

    public Circle(double radius) {
        numberOfCircles +=1;
        this.radius = radius;

    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public double getCircumference() {
       double circumference = Math.PI * 2 * radius;
       return circumference;

    }
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;

    }
}
