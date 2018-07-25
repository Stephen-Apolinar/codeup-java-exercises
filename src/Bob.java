import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk to Bob");
        boolean userContinues = true;
        do {
            String speak = sc.nextLine();
            if (speak.endsWith("?")) {
                System.out.println("sure");
            } else if (speak.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (speak.equals("")) {
                System.out.println("Fine. Be that way!");
            } else System.out.println("whatever");

        } while (userContinues);


    }
}
