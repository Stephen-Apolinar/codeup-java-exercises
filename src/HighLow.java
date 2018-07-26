import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNumber = gameNumber ();
        int guess;
        int guessCount = 10 ;
        do {
            guess = userNumber();
            if (guess < randomNumber) {
                System.out.println("Higher");
                System.out.println("number of guesses left:" + (guessCount-=1));
            } else if (guess > randomNumber) {
                System.out.println("Lower");
                System.out.println("number of guesses left:" + (guessCount-=1));
            } else {
                System.out.println("Good Guess!");
                return;
            }
        } while (guess != randomNumber && guessCount != 0);
        System.out.println("welp! out of guesses, The number was: " + randomNumber );
    }
    public static int gameNumber () {
        return (int) (Math.random() * 100) + 1;
    }
    public static int userNumber () {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number!");
        return input.nextInt();
    }
}
