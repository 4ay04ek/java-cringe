import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        System.out.println(al);
        al.add(2);
        System.out.println(al);
        al.remove(Integer.valueOf(2));
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
    }
}
