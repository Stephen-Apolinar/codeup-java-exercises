package Shapes;

public class Square extends Rectangle {

    protected double side;

    public Square(double side) {
        this.side = side;
        this.width = side;
        this.length = side;


    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);

    }

}
