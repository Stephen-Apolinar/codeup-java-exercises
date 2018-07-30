public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(500, "pizza", true);
//        dish.costInCents = 500;
//        dish.nameOfDish = "pizza";
//        dish.wouldRecommend = true;
        dish.setCostInCents(400);
        dish.setNameOfDish("chicken");
        dish.setWouldRecommend(true);
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());
        dish.eat();
    }
}
