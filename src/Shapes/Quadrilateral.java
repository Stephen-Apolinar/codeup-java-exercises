package Shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {

    }
//Since we don't know what kind of quad this is, the process will be defined in each class (square or rectangle)
    public abstract void setLength (double length);
    public abstract void setWidth (double width);

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }


    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }


    public double getArea() {
        return length * width;
    }
}
