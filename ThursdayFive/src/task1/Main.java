package task1;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Bertram", "Friis", "Birdy"));
        customers.add(new Customer("Phillip", "Heinisch", "Phil"));
        customers.add(new Customer("Marcus", "Andresen", "Marra"));

        printCustomers(customers);

    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }


}
