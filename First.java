import objects.Fact;
import objects.Sort;
import java.util.Scanner;

public class First{ 
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        Fact f = new Fact(in.nextInt());
        System.out.println(f.getFactorial());
        int a[] = {5, 3, 7, 5, 6, 1, 10, 2, 5, 8};
        Sort s = new Sort(a);
        a = s.getArray();
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        in.close();
    }
}