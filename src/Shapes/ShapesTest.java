package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape1 = new Rectangle(7,10);
        System.out.println("Rectangle");
        System.out.println("Area: " + myShape1.getArea());
        System.out.println("Perimeter: " + myShape1.getPerimeter());

        Measurable myShape2 = new Square(5);
        System.out.println("square");
        System.out.println("Area: " + myShape2.getArea());
        System.out.println("Perimeter: " + myShape2.getPerimeter());



//        Inheritance/poly
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }
}
