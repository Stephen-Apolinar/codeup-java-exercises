package Shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        //calls super class constructor
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

}
