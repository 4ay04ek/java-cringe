import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import objects.*;

public class Main {
    private final Map<String, String> INNs = new HashMap<>();
    public void addINN (String lastName, String INN) {
        try {
            Long.parseLong(INN);
            INNs.put(lastName, INN);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void checkINN (String lastName, String INN) throws WrongINNException {
        try {
            Long.parseLong(INN);
        } catch (Exception e) {
            throw new WrongINNException("INN must contain only numbers");
        }
        if (INN.length() != 12) {
            throw new WrongINNException("INN must contain 12 chars");
        }
        if (!INNs.containsKey(lastName)) {
            throw new WrongINNException("You don't exist");
        }
        if (!INNs.get(lastName).equals(INN)) {
            throw new WrongINNException("Incorrect INN for " + lastName);
        }
    }

    public static void main (String[] args) {
        Main shop = new Main();
        shop.addINN ("Ivanov", "123456789012");
        shop.addINN ("Petrov", "012393764567");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter your INN: ");
        String INN = in.nextLine();
        try {
            shop.checkINN(lastName, INN);
            System.out.println("Success");
        } catch (WrongINNException e) {
            System.out.println(e.getMessage());
        }
    }
}
