//
//Create a class of static properties and methods called BurgerTools
//
//        Include a string property of mostPopularTopping
//        Include an int property of averageDaysBeforeExpiration
//        Include an int property of temperatureWhenCooked
//        Include a void method called grill() that prints out "Grilling burger"
//
//        Create a class called BurgerTester to test assigning and printing property values
//        and testing methods.
//
//        If you have time, add additional properties and methods.
class BurgerTools {
    public static String mostPopularTopping;
    public static int averageDaysBeforeExpiration;
    public static int temperatureWhenCooked;

    public BurgerTools(String topping, int i, int i1) {
        mostPopularTopping = topping;
        averageDaysBeforeExpiration = i;
        temperatureWhenCooked = i1;
    }

    public static void grill() {
        System.out.println("Grilling Burger");
    }

}
