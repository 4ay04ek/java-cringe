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
        System.out.println("Choose ball type: \n1.Basketball\n2.Football\n3.Volleyball\n4.Custom");
        int t = in.nextInt();
        switch (t){
            case 1:
                ball.setType(Ball.TYPE.TYPE_BASKETBALL);
                break;
            case 2:
                ball.setType(Ball.TYPE.TYPE_FOOTBALL);
                break;
            case 3:
                ball.setType(Ball.TYPE.TYPE_VOLLEYBALL);
                break;
            default:
                System.out.println("Write diameter and weight:\n");
                int d = in.nextInt(), w = in.nextInt();
                ball.setDiameter(d);
                ball.setWeight(w);
        }
        System.out.printf("%s + %dg + %dw", ball.getType().toString(), ball.getWeight(), ball.getDiameter());
        in.close();
    }
}