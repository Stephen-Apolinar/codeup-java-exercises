import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("pick a number");
//        int number = sc.nextInt();
//        System.out.println("Your number is " + number);


//        System.out.println("choose three words");
//        String one = sc.next();
//        String two = sc.next();
//        String three = sc.next();
//        System.out.println("your three words are.. " + one + " " + two  + " " + three);

//        System.out.println("make a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("what is the width? ");
        String width1 = sc.nextLine();
        int width2 = Integer.parseInt(width1);
        System.out.println("what is the length?");
        String length1 = sc.nextLine();
        int length2 = Integer.parseInt(length1);
        System.out.println("what is the height?");
        String height1 = sc.nextLine();
        int height2 = Integer.parseInt(height1);
        System.out.println("the area is " + (length2 * width2));
        System.out.println("the perimeter is " + ((length2 + length2) + (width2 + width2)));
        System.out.println("the volume is " + (length2 * height2 * width2));
    }
}
