import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("add: 2 + 3 = " + add(2, 3));
        System.out.println("subtract: 7 - 2 = " + subtract(7, 2));
        System.out.println("multiply: 5 * 5 = " + multiply(5, 5));
        System.out.println("divide: 8 / 2 = " + divide(8, 2));
        System.out.println("modulus: 6 % 3 = " + modulus(6, 3));


        System.out.println("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        getInteger(1, 10, input);

        int userInput = getInteger(1,10, input);
        System.out.println("valid input: " + userInput);
        getFactorial(userInput);

        System.out.println("  ");;
        System.out.println("How many sides are on a dice?");
        int sides = sc.nextInt();
        diceRoll(sides);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }


    public static int getInteger(int min, int max, int x) {
        Scanner sc = new Scanner(System.in);

        if (x >= min && x <= max) {
//            System.out.println("That number you entered is: " + x);
            return x;
        }

        System.out.print("That is not a valid number! Please enter an integer");
        int input = sc.nextInt();
        getInteger(1, 10, input);
        return x;


    }
    public static long getFactorial(int number) {

        String multiply = "! = 1";
        int total =1;

        System.out.println("1" + multiply + "=" + total);

        for (int i = 2; i <= number; i++) {
            total = total * i;
            multiply += "x " + i + " ";
            System.out.println(i + multiply + "=" + total);
        }
        return (long) total;
    }
    public static long diceRoll(int sides){
        Scanner sc = new Scanner(System.in);
        long diceOne = Math.round(Math.random() * sides);
        System.out.println("Dice one rolls a.." + diceOne);
        long diceTwo = Math.round(Math.random() * sides);
        System.out.println("Dice two rolls a..." + diceTwo);
        System.out.println("Would you like to roll again? Y/N");
        String confirm = sc.next();
        if (confirm.equals("Y".toLowerCase()) || confirm.equals("Y")) {
            diceRoll(sides);
        }
        return sides;
    }
}

