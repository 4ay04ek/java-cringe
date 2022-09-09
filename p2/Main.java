import objects.Author;
import java.util.Scanner;

public class Main{ 
    public static void main (String args[]){
        System.out.println("Write Author name, email and gender(m/f): ");
        Scanner in = new Scanner(System.in);
        Author a = new Author(in.next(), in.next(), in.next().charAt(0));
        System.out.println(a);
        a.setEmail("a@a.a");
        System.out.println(a.getEmail() + ' ' + a.getGender() + ' ' + a.getName());
        in.close();
    }
}