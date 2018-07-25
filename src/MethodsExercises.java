public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("add: 2 + 3 = " + add(2, 3));
        System.out.println("subtract: 7 - 2 = " + subtract(7, 2));
        System.out.println("multiply: 5 * 5 = " + multiply(5, 5));
        System.out.println("divide: 8 / 2 = " + divide(8, 2));
        System.out.println("modulus: 6 % 3 = " + modulus(6, 3));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }
}

