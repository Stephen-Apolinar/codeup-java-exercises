import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <=100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);


//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }
        System.out.print("What number would you like to go up to? ");
        int number = input.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed |");
        System.out.println("------ | ------- | ----- |");

        for (int i = 1; i <= number; i++) {

            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%-7d| %-8d| %-6d|%n", i, squared, cubed);
        }

    }
}
