package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (length * 2) + (width * 2);
        return perimeter;
    }
}
