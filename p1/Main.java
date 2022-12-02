import objects.Ball;
import java.util.Scanner;

public class Main{ 
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        Ball ball1 = new Ball(Ball.TYPE.TYPE_BASKETBALL);
        System.out.println(ball1);
        Ball ball2 = new Ball();
        ball2.setWeight(450);
        ball2.setDiameter(70);
        System.out.println(ball2);
        Ball ball = new Ball();
        ball.setType(Ball.TYPE.TYPE_BASKETBALL);
        System.out.printf("%s + %dg + %dw\n", ball.getType().toString(), ball.getWeight(), ball.getDiameter());
        ball.setType(Ball.TYPE.TYPE_FOOTBALL);
        System.out.printf("%s + %dg + %dw\n", ball.getType().toString(), ball.getWeight(), ball.getDiameter());
        ball.setType(Ball.TYPE.TYPE_VOLLEYBALL);
        System.out.printf("%s + %dg + %dw\n", ball.getType().toString(), ball.getWeight(), ball.getDiameter());
        in.close();
    }
}