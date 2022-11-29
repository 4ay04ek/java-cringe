import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern p = Pattern.compile("\\+[1-9]");
        Matcher m = p.matcher(in.nextLine());
        System.out.println(m.find());
        in.close();
    }
}
