import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
//                System.out.println(i);
//            }
//        }
    boolean userContinues = true;
    do {
        System.out.print("What number would you like to go up to? ");
        int number = sc.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed |");
        System.out.println("------ | ------- | ----- |");

        for (int i = 1; i <= number; i++) {

            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%-7d| %-8d| %-6d|%n", i, squared, cubed);
        }
        System.out.println("Would you like to enter another number [y/N]?");
        String userResponse = sc.next();
        if (!userResponse.equalsIgnoreCase("y")) {
            userContinues = false;
        }
    } while (userContinues);


//
//
//        System.out.print("What was your grade?");
//        int grade = sc.nextInt();
//        if (grade <= 100 && grade >= 97) {
//            System.out.println("A+");
//        } else if (grade <= 96 && grade >= 93) {
//            System.out.println("A");
//        } else if (grade <= 92 && grade >= 90) {
//            System.out.println("A-");
//        } else if (grade <= 89 && grade >= 87) {
//            System.out.println("B+");
//        } else if (grade <= 86 && grade >= 83) {
//            System.out.println("B");
//        } else if (grade <= 82 && grade >= 80) {
//            System.out.println("B-");
//        } else if (grade <= 79 && grade >= 77) {
//            System.out.println("C+");
//        } else if (grade <= 76 && grade >= 73) {
//            System.out.println("C");
//        } else if (grade <= 72 && grade >= 70) {
//            System.out.println("C-");
//        } else if (grade <= 69 && grade >= 67) {
//            System.out.println("D+");
//        } else if (grade <= 66 && grade >= 63) {
//            System.out.println("D");
//        } else if (grade <= 62 && grade >= 60) {
//            System.out.println("D-");
//        } else if (grade <= 59 && grade >= 0) {
//            System.out.println("F");
//        } else {
//            System.out.println("That was not a number between 0 and 100");
//        }
//
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//        boolean confirmation = userInput.equals("y");
//
//        if (confirmation) {
//            System.out.println("A+: 100-97");
//            System.out.println("A :  96-93");
//            System.out.println("A-:  92-90");
//            System.out.println("B+:  89-97");
//            System.out.println("B :  86-83");
//            System.out.println("B-:  82-80");
//            System.out.println("C+:  70-77");
//            System.out.println("C :  76-73");
//            System.out.println("C-:  72-70");
//            System.out.println("D+:  60-67");
//            System.out.println("D :  66-63");
//            System.out.println("D-:  62-60");
//            System.out.println("F :  59- 0");
//        } else {
//            System.out.println("Grade list not shown");
//        }

    }
}
