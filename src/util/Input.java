package util;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }


    public boolean yesNo() {
        String answer = sc.next();  // null
        // auto-boxing => value (string) -> wrap it in a an object -> new String("y").equalsIgnoreCase()
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        System.out.println("Pick an integer in between" + min + "and " + max);
        int value = getInt();
        if (value < min || value > max) {
            return getInt(min, max);
        }
        return value;
    }

    public int getInt() {
        return sc.nextInt();

    }
    public double getDouble(double min, double max) {
        System.out.println("Pick an integer in between " + min + "and " + max);
        int value = getInt();
        if (value < min || value > max) {
            return getDouble(min, max);
        }
        return value;
    }
    public double getDouble() {
        return sc.nextDouble();
    }
}
