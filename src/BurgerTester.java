public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools.grill();

        BurgerTools bacon = new BurgerTools("bacon", 3, 300);
        System.out.println(bacon.mostPopularTopping);
        System.out.println(bacon.averageDaysBeforeExpiration);
        System.out.println(bacon.temperatureWhenCooked);


    }
}
