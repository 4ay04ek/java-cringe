import java.util.Scanner;

public class Main {
    static private String getDetails(String key) throws Exception {
        if (key.equals("")) throw new Exception("Key is empty");
        return "data for " + key;
    }
    static private void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    static private void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Key:");
        int attempts = 2;
        while (attempts > 0) {
            try {
                String key = myScanner.nextLine();
                printDetails(key);
                attempts = 0;
            } catch (Exception e) {
                System.out.println(e);
                attempts -= 1;
                if (attempts > 0) System.out.println("Try again:");
            }
        }
        myScanner.close();
    }
    public static void main(String[] args) {
        getKey();
    }
}
