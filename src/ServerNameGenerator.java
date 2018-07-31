public class ServerNameGenerator {
    public static void main(String[] args) {

        String [] adjectives = {"quick", "jumpy", "wonderful", "silky", "thundering", "obnoxious", "zany", "late", "colossal", "filthy"};

        String [] nouns = {"tank", "telephone", "cake", "useless brakes", "pistol", "volcano", "coyote", "light bulb", "metal", "ladybug"};

        String randomAdjective = getRandom(adjectives);
        String randomNoun = getRandom(nouns);

        String serverName = randomAdjective + "-" + randomNoun;

        System.out.println("Here's your server name! " + serverName);
    }

    public static String getRandom(String [] array) {
        int randomIndex = (int) Math.floor(Math.random() * array.length);
        return array[randomIndex];
    }

}
