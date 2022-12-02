package objects;

import java.util.Scanner;

public class FunctionalChair implements Chair {
    public int sum(int a, int b){
        return a + b;
    }
    @Override
    public void action()
    {
        System.out.println("It is a functional chair!");
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a, b:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a+"+"+b+"="+sum(a,b));
        scanner.close();
    }

}
