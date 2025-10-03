package Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeMenu() {
        return coffeMenu;
    }

    public void loadMenuData() {
        File file = new File("Coffees.txt");

        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String coffe = sc.nextLine();
                coffeMenu.add(coffe);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found"); // "err" Marks the error message in red
        }
    }
}
