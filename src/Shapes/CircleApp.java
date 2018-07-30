package Shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        getCircumferenceAndArea();
    }

    public static void getCircumferenceAndArea() {

            Input input = new Input();

            System.out.println("Enter the radius of the circle");

            double radius = input.getDouble();

            Circle r = new Circle(radius);

            System.out.println("The radius is " + radius);
            System.out.println("The area is " + r.getArea());
            System.out.println("The Circumference is " + r.getCircumference());


        System.out.println("Would you like to create another circle? ");
        input.yesNo();
        boolean yes = input.yesNo();


        if (yes) {
            getCircumferenceAndArea();
        } else {
            System.out.println("you created " + r.getNumberOfCircles() + " circle(s)");
        }
    }
}
