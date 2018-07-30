//import java.util.Scanner;
//
//public class Hangman {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int guessCount = 9;
//        String guess;
//        boolean play = true;
//        String word;
//        do {
//            guess = guessWord();
//            System.out.println("Welcome to the game!");
//            System.out.println("Player 1 please choose a word");
//            word = sc.nextLine();
//            if (guess.equalsIgnoreCase())
//            System.out.println("Player 2 you have" + guessCount + "guesses left");
//            System.out.println(guessWord(word));
//            System.out.println("Would you like to play again? (y/n)");
//            String userResponse = sc.nextLine();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                play = false;
//            }
//        } while (play && guess != word);
//
//    }
//
//    public static String guessWord(String word) {
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (ch == word.charAt(i)) {
//                return sc.nextline();
//            }
//        }
//    }
//
//}
