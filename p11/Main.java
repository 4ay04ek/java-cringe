import java.util.Scanner;

import objects.*;

public class Main{ 
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number: ");
        float f = in.nextFloat();
        System.out.print("Answer for x^2-2x+1: ");
        System.out.println(new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const(2), new Variable("x"))), new Const(1)).evaluate(f));
        in.close();
    }
}