package util;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public String getString (String prompt) {
        prompt = (prompt.isEmpty()) ? "Type: ": prompt;
        System.out.println(prompt);
        return this.sc.nextLine();
    }

    public String getString () {
       return this.getString("type: ");
    }

    public boolean yesNo () {
        String result = this.getString("type: yes or no (y/n)");
        return (result.equalsIgnoreCase("y") || result.equalsIgnoreCase(("yes")));
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
