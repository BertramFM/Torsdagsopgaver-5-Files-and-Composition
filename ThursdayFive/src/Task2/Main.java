package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cafe cafe = new  Cafe();
        cafe.loadMenuData();
        cafe.getCoffeMenu();

        ArrayList<String> coffeMenu = cafe.getCoffeMenu();
        for (String coffe: coffeMenu) {
            System.out.println(coffe);
        }
    }
}
