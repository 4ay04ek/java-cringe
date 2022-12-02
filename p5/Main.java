import java.util.Scanner;

public class Main{ 
    static private void nums(int n){
        if (n > 1) nums(n - 1);
        System.out.print(n + " ");
    }

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        int a = in.nextInt();
        nums(a);
        in.close();
    }
}