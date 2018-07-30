package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        input.getString(input.getString());
        input.getString("helllo");
        System.out.println(input);
    }
}
