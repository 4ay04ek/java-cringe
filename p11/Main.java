import objects.*;

public class Main{ 
    public static void main (String args[]){
        for (int i = 1; i <= 10; i++){
            System.out.println(new Subtract(new Add(new Divide(new Const(3), new Variable("x")), new Multiply(new Const(3), new Variable("x"))), new Const(3)).evaluate(i));
        }
    }
}