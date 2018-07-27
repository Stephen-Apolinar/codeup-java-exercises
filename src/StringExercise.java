import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String message = "We don't need no education \n" +
//                "We don't need no thought control\n" +
//                "\n" +
//                "Check \"this\" out!, \"s inside of \"s!\n" +
//                "\n" +
//                "In windows, the main drive is usually C:\\\n" +
//                "\n" +
//                "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//
//        System.out.println(message);
        boolean userContinues = true;
        do {
            String word;
            System.out.println("Enter your word");
            word = sc.nextLine();
            System.out.println("|======== VOWEL COUNT ========|");
            System.out.println("| A's | E's | I's | O's | U's |");
            System.out.printf("|%-5d| %-4d| %-4d| %-4d| %-4d|%n",
                    numA(word), numE(word), numI(word), numO(word), numU(word));
            System.out.println("|=============================|");

            System.out.println("Would you like to enter another word? (y/n)");
            String userResponse = sc.nextLine();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);

    }
        public static int numA (String word){
            int aCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a') {
                    aCount += 1;
                }
            }
            return aCount;

        }
        public static int numE (String word){
            int eCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'e') {
                    eCount += 1;
                }
            }
            return eCount;

        }
        public static int numI (String word){
            int iCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'i') {
                    iCount += 1;
                }
            }
            return iCount;

        }
        public static int numO (String word){
            int oCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'o') {
                    oCount += 1;
                }
            }
            return oCount;

        }
        public static int numU (String word){
            int uCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'u') {
                    uCount += 1;
                }
            }
            return uCount;

        }


}

//------ 1 ------
//        Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that
//        vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
//        EXAMPLE...
//        INPUT: countVowels("cat")
//        OUTPUT:
//        |======== VOWEL COUNT ========|
//        | A's | E's | I's | O's | U's |
//        | 1   | 0   | 0   | 0   | 0   |
//        |=============================|
//        countVowels() will use...
//        countAs(),
//        countEs(),
//        countIs(),
//        countOs(),
//        and countUs()

